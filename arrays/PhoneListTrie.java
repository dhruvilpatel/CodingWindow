package arrays;

public class PhoneListTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneListTrie t = new PhoneListTrie();
//		String[] phoneArr = {"911","97625999","91125426"};
		String[] phoneArr = {"113","12340", "123440","12345", "98346"};
		String flag = "YES";
		for(String number: phoneArr) {
			if(!t.insertPhone(number)) {
				flag  = "NO";
				break;
			}
		}
		System.out.println(flag);
	}

	TrieNode arr;
	public PhoneListTrie(){
		this.arr =new TrieNode();
	}
	
	boolean insertPhone(String value){
		TrieNode curr = arr;
		for(char c : value.toCharArray()){		
			int index = c - '0';
			if(curr.node[index] == null && !curr.isEnd){
				TrieNode temp = new TrieNode();
				curr.node[index] = temp;
				curr = temp;
			}else if(curr.isEnd || curr.node[index].isEnd){
				return false;
			}else {
				curr = curr.node[index];
			}
		}
		curr.isEnd = true;
		return true;
	}
}

class TrieNode{
	boolean isEnd;
	TrieNode[] node;

	public TrieNode(){
		this.node = new TrieNode[10];
	}	
}
