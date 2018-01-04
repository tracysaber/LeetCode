import java.util.LinkedList;
import java.util.List;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each word is a valid dictionary word. You may assume the dictionary does not contain duplicate words.

 Return all such possible sentences.

 For example, given
 s = "catsanddog",
 dict = ["cat", "cats", "and", "sand", "dog"].

 A solution is ["cats and dog", "cat sand dog"].
 */
public class Leet_140 {
//	String global_s;
//	List<String> global_wordDict;
//	public List<String> wordBreak(String s, List<String> wordDict) {
//		//LinkedList<List<String>> result = new LinkedList<List<String>>();
//		List<String > result = new LinkedList<String>();
//		global_s = s;
//		global_wordDict = wordDict;
//		wordIterator(0,s.length(),new LinkedList<String>(),result);
//		return result;
//	}
//	void wordIterator(int start,int end,List<String> pre,List<String> re){
//		if(end==start){
//			//List<String> element = new LinkedList<String>(pre);
//			StringBuilder element =new StringBuilder();
//			for(String e:pre){
//				element.append(e);
//				element.append(" ");
//			}
//			re.add(element.deleteCharAt(element.length()-1).toString());
//			return ;
//		}
//		for(int i=start+1;i<=end;i++){
//			if(global_wordDict.contains(global_s.substring(start,i))){
//				pre.add(global_s.substring(start,i));
//				wordIterator(i,end,pre,re);
//				pre.remove(pre.size()-1);
//			}
//		}
//	}
	public List<String> wordBreak(String s,List<String> wordDict){
		List<List<String>> result = new LinkedList<List<String>>();
		boolean re [] = new boolean[s.length()+1];
		re[0] = true;
		for(int i =1;i<s.length();i++){
			for(int j =0;j<i;j++){
				if(result[j]&&wordDict.contains(s.substring(j,i)))
				{
					result[i] = true;
					break;
				}
			}
		}
		return result[s.length()];
	}
	public static void main(String args[]){
		List<String> dict = new LinkedList<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		List<String> a = new Leet_140().wordBreak("catsanddog",dict);
	}
}
