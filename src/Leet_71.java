import java.util.Stack;

/**
 * Created by tracysaber on 2017-11-9.
 * Given an absolute path for a file (Unix-style), simplify it.

 For example,
 path = "/home/", => "/home"
 path = "/a/./b/../../c/", => "/c"
 */
public class Leet_71 {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<String>();
        StringBuilder a = new StringBuilder();
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                if(!a.toString().equals("")){
                    if(a.toString().equals("..")){
                        if(!s.isEmpty())
                            s.pop();
                    }
                    else {
                        if (!a.toString().equals(".")) {
                            s.push(a.toString());
                        }
                    }
                }
                a = new StringBuilder();
            }
            else{
                a.append(path.charAt(i));
            }
        }
        if(!a.toString().equals("")){
            if(a.toString().equals("..")){
                if(s.isEmpty())
                    return "/";
                else
                    s.pop();
            }
            else {
                if (!a.toString().equals(".")) {
                    s.push(a.toString());
                }
            }
        }
        if(s.isEmpty())
            return "/";
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.size();i++){
            result.append("/");
            result.append(s.get(i));
        }
        return result.toString();
    }
    public static void main(String args[]){
        System.out.println(new Leet_71().simplifyPath("/../"));
    }
}
