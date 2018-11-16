package strings;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*          
                                            ASSUMPTIONS
        
        1) Performing plagarism detection after removing all the special charaters from the file
        2) Words-separation is done by space
        3) Percentage is return in float
        4) There can be at most 4 arguments that can be passed to the main function    
        5) File 1 is treated for generating all possible combination of the sentences and then file 2 is compared with file 1 for calculating plagarism
*/

public class PlagiarismDetection {

    private HashMap<String, String[]> synonymDict = new HashMap<>();

    public static void main(String args[]) throws FileNotFoundException {
        String synonymsFile = args[0];
        String inputFile1 = args[1];
        String inputFile2 = args[2];
        int tupleSize;
        if (args.length == 4)
            tupleSize = Integer.parseInt(args[3]);
        else
            tupleSize = 3;

        PlagiarismDetection pd = new PlagiarismDetection();
        pd.buildSynonymDictionary(synonymsFile);

        System.out.println(Float.toString(pd.nTupleDetection(inputFile1, inputFile2, tupleSize)) + " %");
    }

    // Given the input file generates the HashMap Dictionary where for each key stores all possible synonyms
    // Time Complexity - O(n) where n is total number of tokens (synonyms)
    private void buildSynonymDictionary(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                synonymDict.put(token, tokens);
            }
        }
    }

    // returns the plagiarism percentage by reading and generating the Set for the given tokensize
    // input file1 and file2
    private float nTupleDetection(String file1, String file2, final int tupleSize) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file1));
        HashSet<String> file1Tuples = new HashSet<>();

        // sliding window queue
        LinkedHashMap<Integer, String> queue = new LinkedHashMap<Integer, String>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return this.size() > tupleSize;
            }
        };

        int actualFile1Tuples = 0;
        int i = 0;
        while (sc.hasNext()) {
            try {
                queue.put(i++, cleanToken(sc.next()));
            } catch (NoSuchElementException ignored) {
                file1Tuples.addAll(buildPermutations(queue.values().toArray(new String[0])));
                actualFile1Tuples++;
            }
            if (queue.size() == tupleSize) {
                actualFile1Tuples++;
                file1Tuples.addAll(buildPermutations(queue.values().toArray(new String[0])));
            }
        }
        
        // build tuples for file2
        HashSet<String> file2Tuples = new HashSet<>();
        sc = new Scanner(new File(file2));
        queue.clear();

        i = 0;
        while (sc.hasNext()) {
            try {
                queue.put(i++, cleanToken(sc.next()));
            } catch (NoSuchElementException ignored) {
                file2Tuples.add(String.join(" ", queue.values()));
            }
            if (queue.size() == tupleSize) {
                file2Tuples.add(String.join(" ", queue.values()));
            }
        }
        // get the intersection
        file1Tuples.retainAll(file2Tuples);
        // calculate the percentage of plagiarism
        return (file1Tuples.size() * 1.0f / actualFile1Tuples) * 100;
    }

    // remove all the special characters
    private String cleanToken(String token) {
        return token.replaceAll("\\p{P}", "");
    }

    // Generates all the possible combination
    // Time Complexity = O(mno) where O(mn) = addToAllStrings method and O(o) = list of the token
    private HashSet<String> buildPermutations(String[] tokens) {
        HashSet<String> allCombination = new HashSet<>();
        for (String token : tokens) {
            if (synonymDict.containsKey(token)) {
                // if synonym exists
                allCombination = addToAllStrings(allCombination, synonymDict.get(token));
            } else {
                // if no synonym exist
                allCombination = addToAllStrings(allCombination, token);
            }
        }
        return allCombination;
    }

    // Return the combination string form by merging token with all strings formed so far
    // Time Complexity = O(mn) where m = size of allString and n = size of tokens
    private HashSet<String> addToAllStrings(HashSet<String> allStrings, String... token) {
        HashSet<String> newStrings = new HashSet<>();
        for (String tuple : allStrings) {
            for (String t : token) {
                newStrings.add(tuple + " " + t);
            }
        }
        if (newStrings.isEmpty())
            newStrings.addAll(Arrays.asList(token));
        return newStrings;
    }
}