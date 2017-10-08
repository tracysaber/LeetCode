import java.util.*;

/**
 * Created by tracysaber on 2017-10-8.
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */
public class Leet_22 {
//    public boolean isVliad(String s){
//        Stack<Character> ss=new Stack<Character>();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='(')
//                ss.push('(');
//            else{
//                if(!ss.empty())
//                    ss.pop();
//                else
//                    return false;
//            }
//        }
//        if(ss.empty())
//            return true;
//        else
//            return false;
//    }
//    public List<String> generateParenthesis(int n) {
//        List<String> result = new LinkedList<String>();
//        StringBuilder builder=new StringBuilder();
//        for(int i =0;i<n;i++){
//            builder.append('(');
//        }
//        for()
//
//    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        if(n==1){
            result.add("()");
        }
        else{
            List<String> pre = generateParenthesis(n-1);
            Set<String> re = new HashSet<String>();
            for(int i =0;i<pre.size();i++){
                StringBuilder builder = new StringBuilder(pre.get(i));
                for(int j=0;j<builder.length();j++){
                    StringBuilder b = new StringBuilder(builder);
                    b.insert(j,"()");
                    re.add(b.toString());
                }
            }
            result=new LinkedList<String>(re);

        }
        return result;
    }
    public static void main(String args[]){
        List<String> a= new Leet_22().generateParenthesis(2);
        System.out.println();
    }
}
