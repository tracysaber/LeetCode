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
            for(int i =0;i<words.length;i++){
                w.put(words[i],0);
            }
        }
        for(int i =0;i<s.length()-sublen+1;i++){
            String word = s.substring(i,i+ wordklen * words.length);
            Map<String,Integer> temp = new HashMap<String, Integer>(w);
            Set<String> keyset = new HashSet<String>();
            for(String key:temp.keySet()){
                keyset.add(key);
            }
            Iterator<String> it =keyset.iterator();
            while(it.hasNext()){
                String key=it.next();
                if(!word.contains(key))
                    break;
                else {
                    String ws[]=word.split(key);
                    word="";
                    for(int j=0;j<ws.length;j++){
                        word+=ws[j];
                    }
                    temp.remove(key);
                }
            }
            if(temp.isEmpty())
                l.add(i);
        }
        return l ;
    }
    public static void main(String args[]){
        String s="lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String words[] = {"fooo","barr","wing","ding","wing"};
        //String words[]={"foo", "bar"};
        List<Integer> ll =new Leet_30().findSubstring(s,words);
    }
}
