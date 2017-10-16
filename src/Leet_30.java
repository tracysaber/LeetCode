import java.util.*;

/**
 * Created by tracysaber on 2017-10-15.
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

 For example, given:
 s: "barfoothefoobarman"
 words: ["foo", "bar"]

 You should return the indices: [0,9].
 (order does not matter).
 */
public class Leet_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        int sublen=0;
        int wordklen = words[0].length();
        Map<String ,Integer> w = new HashMap<String, Integer>();
        List<Integer> l = new LinkedList<Integer>();
        if(words.length==0)
            return null;
        else{
            sublen = words.length * words[0].length();
            for(String W:words)
                w.put(W,w.containsKey(W)?w.get(W)+1:1);
        }
        for(int i =0;i<s.length()-sublen+1;i++){
            Map<String,Integer> temp = new HashMap<String, Integer>(w);
            //Set<String> keyset = new HashSet<String>(w.keySet());
            for(int j=0;j<words.length;j++){
                String subs = s.substring(i+j*wordklen,i+j*wordklen+wordklen);
                if(!temp.containsKey(subs)||temp.get(subs)<1)
                    break;
                else
                    temp.put(subs, temp.get(subs) - 1);
                if(temp.get(subs)==0)
                    temp.remove(subs);

            }
            if(temp.isEmpty())
                l.add(i);
        }
        return l ;
    }
    public static void main(String args[]){
        String s="ababaab";
        String words[] = {"ab","ba","ba"};
        //String words[]={"foo", "bar"};
        List<Integer> ll =new Leet_30().findSubstring(s,words);
        //String ss = "my.test.txt.test";
        //System.out.println(s.replace("barr", "#"));
    }
}
