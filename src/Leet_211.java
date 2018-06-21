/**
 * Design a data structure that supports the following two operations:

 void addWord(word)
 bool search(word)
 search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.

 Example:

 addWord("bad")
 addWord("dad")
 addWord("mad")
 search("pad") -> false
 search("bad") -> true
 search(".ad") -> true
 search("b..") -> true
 Note:
 You may assume that all words are consist of lowercase letters a-z.
 */
class SingleNode{
	boolean isWord;
	char character;
	SingleNode next[];
	public SingleNode(){
		isWord= false;
		next = new SingleNode[26];
	}
}
class WordDictionary {
	SingleNode root;
	/** Initialize your data structure here. */
	public WordDictionary() {
		root = new SingleNode();
	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		SingleNode it = root;
		for(int i=0;i<word.length();i++){
			char now = word.charAt(i);
			if(it.next[now-'a']==null)	{
				it.next[now-'a']=new SingleNode();
				it.next[now-'a'].character = now;
			}
			it = it.next[now-'a'];
		}
		it.isWord= true;
	}
	private boolean searchNode(String w,SingleNode sn){
		for(int i=0;i<w.length();i++){
			char now = w.charAt(i);
			if(now=='.'){
				for(int j=0;j<26;j++){
					if(sn.next[j]!=null&&searchNode(w.substring(1),sn.next[j]))	return true;
				}
				return false;
			}
			else{
				if(sn.next[now-'a']!=null)	return searchNode(w.substring(1),sn.next[now-'a']);
				else return false;
			}
		}
		if(sn.isWord==true)	return true;
		else  return false;
	}
	/** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
	public boolean search(String word) {
		return searchNode(word,root);
	}
}
public class Leet_211 {
	public static void main(String args[]){
		WordDictionary wd = new WordDictionary();
		wd.addWord("bad");
		wd.addWord("dad");
		wd.addWord("mad");
		System.out.print(wd.search("pad"));
		System.out.print(wd.search("bad"));
		System.out.print(wd.search(".ad"));
		System.out.print(wd.search("b.."));
	}
}
