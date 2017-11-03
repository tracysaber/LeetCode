/**
 * Created by tracysaber on 2017-11-3.
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 */
public class Leet_58 {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty())
            return 0;
        else{
            String ss[] = s.split(" ");
            if(ss.length==0)
                return 0;
            return ss[ss.length-1].length();
        }
    }
    public static void main(String args[]){
        System.out.println(new Leet_58().lengthOfLastWord(" "));
    }
}
