package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ElectionWinner {
	// Given number of names list find who won election. If clash return last name according to alphabetical sort
	// between aa and ab return ab
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static String electionWinner(String[] votes) {
        /*
         * Write your code here.
         */
        
        HashMap<String, Integer> voteHM = new HashMap<String, Integer> ();
        int highestVote = 1;
        for (String vote : votes){
            if(voteHM.containsKey(vote)) {
                int voteCount = voteHM.get(vote);
                if(voteCount + 1 > highestVote) highestVote = voteCount+1;
                voteHM.put(vote, voteCount + 1);
            }
            else voteHM.put(vote, 1);
        }
        return getWinner(voteHM, highestVote);
    }

    static String getWinner(HashMap<String, Integer> voteHM, int highestCount){
        ArrayList<String> clashedName = new ArrayList<String> ();
        for(String key : voteHM.keySet()){
            if(voteHM.get(key) == highestCount) clashedName.add(key); 
        }
        
        Collections.sort(clashedName);
        
        return clashedName.get(clashedName.size() - 1);
        
    }

}
