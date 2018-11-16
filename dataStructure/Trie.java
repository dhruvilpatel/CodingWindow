package dataStructure;
public class Trie {

	
	TrieNode arr;
	
	public Trie(){
		this.arr =new TrieNode();
	}
	
	void insertWord(String value){
		TrieNode curr = arr;
		for(char c : value.toUpperCase().toCharArray()){
			
			int index = c - 'A';
			if(curr.node[index] == null){
				TrieNode temp = new TrieNode();
				curr.node[index] = temp;
				curr = temp;
			}else{
				curr = curr.node[index];
			}
		}
		curr.isEnd = true;
	}
	
	boolean searchWord(String word){
		TrieNode curr = arr;
		for(char c: word.toUpperCase().toCharArray()){
			int index = c - 'A';
			if(curr.node[index] == null) return false;
			else { 
				curr = curr.node[index];
			}
		}
		
			return true;
	}
	
	public static void main(String[] args){
		
		Trie t = new Trie();
		t.insertWord("Dhruvil");
		System.out.println(t.searchWord("Dhruvil"));
		
	}
	
}

class TrieNode{
	boolean isEnd;
	TrieNode[] node;
	
	public TrieNode(){
		this.node = new TrieNode[26];
	}
	
}
