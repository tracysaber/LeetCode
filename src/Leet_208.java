class TrieNode{
	Character character ;
	boolean isWord ;
	TrieNode nextTrie[] = new TrieNode[26];
	public TrieNode(Character c){
		this.character =c;
	}
}
class Trie {
	TrieNode root;
	/** Initialize your data structure here. */
	public Trie() {
		root = new TrieNode(' ');
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		TrieNode point  = this.root;
		for(int i=0;i<word.length();i++){
			Character now = word.charAt(i);
			if(point.nextTrie[now-'a']==null){
				point.nextTrie[now-'a']= new TrieNode(now);

			}
			point = point.nextTrie[now-'a'];
		}
		point.isWord=true;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		TrieNode  point  = this.root;
		for(int i=0;i<word.length();i++){
			Character now= word.charAt(i);
			if(point.nextTrie[now-'a']==null)	return false;
			else point= point.nextTrie[now-'a'];
		}
		if(point.isWord)	return true;
		else return false;
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
		TrieNode  point  = this.root;
		for(int i=0;i<prefix.length();i++){
			Character now= prefix.charAt(i);
			if(point.nextTrie[now-'a']==null)	return false;
			else point= point.nextTrie[now-'a'];
		}
		return true;
	}
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

public class Leet_208 {
	public static void main(String args[]){
		Trie obj = new Trie();
 		obj.insert("abc");
 		System.out.print(obj.search("abc"));
 		System.out.print(obj.startsWith("ab"));
 		//boolean param_3 = obj.startsWith("ab");
	}
}
