import java.util.HashMap;
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
//	public List<String> wordBreak(String s,List<String> wordDict){
//		List<List<String>> result = new LinkedList<List<String>>();
//		boolean re [] = new boolean[s.length()+1];
//		re[0] = true;
//		result.add(new LinkedList<String>());
//		for(int i =1;i<re.length;i++){
//			result.add(new LinkedList<String>());
//			for(int j =0;j<i;j++){
//				if(re[j]&&wordDict.contains(s.substring(j,i)))
//				{
//					re[i] = true;
//					String word = s.substring(j,i);
//					List<String> pre = result.get(j);
//					if(pre.isEmpty())	result.get(i).add(word);
//					else{
//						for(int k=0;k<pre.size();k++)	result.get(i).add(pre.get(k)+" "+word);
//					}
//				}
//			}
//		}
//		return result.get(s.length());
//	}
public List<String> wordBreak(String s, List<String> wordDict) {
	return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
}

	// DFS function returns an array including all substrings derived from s.
	List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>> map) {
		if (map.containsKey(s))
			return map.get(s);

		LinkedList<String>res = new LinkedList<String>();
		if (s.length() == 0) {
			res.add("");
			return res;
		}
		for (String word : wordDict) {
			if (s.startsWith(word)) {
				List<String>sublist = DFS(s.substring(word.length()), wordDict, map);
				for (String sub : sublist)
					res.add(word + (sub.isEmpty() ? "" : " ") + sub);
			}
		}
		map.put(s, res);
		return res;
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
