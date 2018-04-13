import java.util.*;

public class Main{
    public boolean judge(String a){
        Stack<Character> stack = new Stack<Character>();
        stack.push('(');
        stack.push('(');
        for(int i=0;i<a.length();i++){
            char now = a.charAt(i);
            if(now=='('){
                stack.push(now);
            }
            if(now==')'){
                if(stack.isEmpty()){
                    return false;
                }
                else
                    stack.pop();
            }
        }
        if(stack.size()==2)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int  t = scan.nextInt();
        String s[] =new String[t];
        for(int i=0;i<t;i++){
            s[i]=scan.next();
        }
        for(int i=0;i<t;i++){
            if(new Main().judge(s[i]))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}