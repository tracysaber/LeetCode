import java.util.LinkedList;
import java.util.List;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find all shortest transformation sequence(s) from beginWord to endWord, such that:

 Only one letter can be changed at a time
 Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 For example,

 Given:
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log","cog"]
 Return
 [
 ["hit","hot","dot","dog","cog"],
 ["hit","hot","lot","log","cog"]
 ]
 Note:
 Return an empty list if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 You may assume no duplicates in the word list.
 You may assume beginWord and endWord are non-empty and are not the same.
 UPDATE (2017/1/20):
 The wordList parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.


 */
public class Leet_126 {
	LinkedList<List<String>> result = new LinkedList<List<String>>();
	int min = Integer.MAX_VALUE;
	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		if(wordList.size()==0)	return result;
		List<String> now = new LinkedList<String>();
		now.add(beginWord);
		findNext(beginWord,endWord,wordList,now);
		return result;
	}
	public void findNext(String word,String endWord,List<String> wordList, List<String> now){
		if(word.equals(endWord)){
			if(result.isEmpty()||min==now.size()){
				result.add(new LinkedList<String>(now));
				min = now.size();
			}
			else{
				if(min>now.size()){
					result.clear();
					result.add(new LinkedList<String>(now));
					min = now.size();
				}
			}
			return;
		}
		for(int i = 0;i<wordList.size();i++){
			if(!now.contains(wordList.get(i))&&isValid(word,wordList.get(i))){
				now.add(wordList.get(i));
				if(now.size()<=min)
					findNext(wordList.get(i),endWord,wordList,now);
				now.remove(now.size()-1);
			}
		}
	}
	public boolean isValid(String s1,String s2){
		int count =0,i=0;
		while(i<s1.length()&&count<2){
			if(s1.charAt(i)!=s2.charAt(i))
				count++;
			i++;
		}
		if(count==1)	return true;
		else return false;
	}
	public static void main(String args[]){
		List<String> a = new LinkedList<String>();
		a.add("hot");
		a.add("dot");
		a.add("dog");
		a.add("lot");
		a.add("log");
		a.add("cog");
		List<List<String>> b = new Leet_126().findLadders("hit","cog",a);
	}
}
