import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.
 */
public class Leet_205 {
	public boolean isIsomorphic(String s, String t) {
		Map<Character,Character> c = new HashMap<Character,Character>();
		Set<Character> exists = new HashSet<Character>();
		for(int i =0;i<s.length();i++){
			//if(s.charAt(i)!=t.charAt(i)){
				if(!c.containsKey(s.charAt(i))){
					if(exists.contains(t.charAt(i)))	return false;
					else	{
						c.put(s.charAt(i),t.charAt(i));
						exists.add(t.charAt(i));
					}
				}
				else{
					if(c.get(s.charAt(i))!=t.charAt(i))	return false;
				}
			//}
		}
		return true;
	}
	public static void main(String args[]){
		System.out.print(new Leet_205().isIsomorphic("ab","aa"));
	}
}
