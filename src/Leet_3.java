import java.util.*;

/**
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Leet_3 {
    public boolean no_repeat_string (String s){
        Map<Character,Integer> ss=new HashMap();
        boolean flag =true;
        for(int i=0;i<s.length();i++){
            if(!ss.containsKey(s.charAt(i)))
                ss.put(s.charAt(i),1);
            else
                flag=false;
        }
        return flag;
    }
    public int lengthOfLongestSubstring(String s) {
        int i =0,j=0,max=0;
        Set<Character> set = new HashSet<Character>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max=Math.max(max,set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
    public static void main(String args[]){
        String s = new String("pwwkew");
        System.out.println(new Leet_3().lengthOfLongestSubstring(s));
    }
}
