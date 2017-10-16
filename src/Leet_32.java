import java.util.Stack;

/**
 * Created by tracysaber on 2017-10-16.
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class Leet_32 {
    public int longestValidParentheses(String s) {
        Stack<Character> par = new Stack<Character>();
        int max = 0;
        int len =0 ;
        int left =0;
        for(int i =0;i<s.length();i++){
            //int len=0;

            if(s.charAt(i)=='('){
                par.push('(');
                left++;
            }
            else{
                if(par.empty()){
                    if(len!=0)
                        len=0;
                }
                else{
                    par.pop();
                    if(par.empty())
                        len+=(left*2);
                    max = Math.max(len,max);
                    left=0;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        int a = new Leet_32().longestValidParentheses("()(()");
    }
}
