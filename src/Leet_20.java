import java.util.Stack;

/**
 * Created by tracysaber on 2017-10-8.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Leet_20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char element = s.charAt(i);
            if(element=='{'||element=='('||element=='['){
                stack.push(element);
            }
            if(element=='}'||element==')'||element==']'){
                if(stack.empty())
                    return false;
                char left=stack.pop();
                if(left=='{'&&element!='}')
                    return false;
                if(left=='('&&element!=')')
                    return false;
                if(left=='['&&element!=']')
                    return false;
            }
        }
        if(stack.size()==0)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        String s="()[]{}";
        System.out.println(new Leet_20().isValid(s));
    }
}
