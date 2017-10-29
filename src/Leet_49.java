import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * Created by tracysaber on 2017-10-29.
 * Given an array of strings, group anagrams together.

 For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:

 [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]
 */
public class Leet_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<String, List<String>>();
        for(int i=0;i< strs.length;i++){
            String sorted = sortString(strs[i]);
            if(result.containsKey(sorted)){
                result.get(sorted).add(strs[i]);
            }
            else{
                List<String> newvalue= new LinkedList<String>();
                newvalue.add(strs[i]);
                result.put(sorted,newvalue);
            }
        }
        List<List<String>> re = new LinkedList<List<String>>();
        for(List<String> element :result.values()){
            re.add(element);
        }
        return re;
    }
    public String sortString (String tobesorted){
        char a[]=tobesorted.toCharArray();
        Arrays.sort(a);
        return String.valueOf(a);
    }
    public static void main(String args[]){
        String s[]={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>>  a= new Leet_49().groupAnagrams(s);
    }
}
