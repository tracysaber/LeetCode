import java.util.Stack;

/**
 * Created by tracysaber on 2017-10-16.
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class Leet_32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> par = new Stack<Integer>();
        int max = 0;
        int left =-1;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                par.push(i);
            }
            else {
                if(par.isEmpty())
                    left =i;
                else{
                    par.pop();
                    if(par.isEmpty())
                        max = Math.max(max,i-left);
                    else
                        max = Math.max(max,(i-par.peek()));

                }
            }

        }
        return max;
    }
    public static void main(String args[]){
        int a = new Leet_32().longestValidParentheses("()(()");
    }
}
