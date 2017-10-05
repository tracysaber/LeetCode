import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-10-4.
 * Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.



 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 Note:
 Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class Leet_17 {
    public List<String> letterCombinations(String digits) {
        String digit[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> re = new LinkedList<String>();
        if(digits.length()==0)
            return re;
        if (digits.length()==1){
            if(Character.isDigit(digits.charAt(0))) {
                String c = digit[digits.charAt(0)-'0'-1];
                for(int i=0;i<c.length();i++){
                    re.add(String.valueOf(c.charAt(i)));
                }
                return re;
            }
            return re;
        }
        else{
            String c=digit[digits.charAt(digits.length()-1)-'0'-1];
            List<String> pre =letterCombinations(digits.substring(0,digits.length()-1));
            for(int i=0;i<pre.size();i++){
                String base = pre.get(i);
                for(int j=0;j<c.length();j++){
                    re.add(base+c.charAt(j));
                }
            }
            return re;

        }

    }
    public static void main(String args[]){
        List<String> a= new Leet_17().letterCombinations("23");

    }
}
