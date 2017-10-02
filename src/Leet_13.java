import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tracysaber on 2017-10-1.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Leet_13 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length>0){
            Arrays.sort(strs);
            int len =Math.min(strs[0].length(),strs[strs.length-1].length());
            StringBuilder ss= new StringBuilder();
            for(int i=0;i<len;i++){
                if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
                    ss.append(strs[0].charAt(i));
                else
                    return ss.toString();
            }
            return ss.toString();
        }
        return "";
    }
    public static void main(String args[]){
        String strs[]={"you","yo","yoyoyo"};
        System.out.println(new Leet_13().longestCommonPrefix(strs));
    }
}
