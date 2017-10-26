/**
 * Created by tracysaber on 2017-9-27.
 * '.' Matches any single character.
 '*' Matches zero or more of the preceding element.

 The matching should cover the entire input string (not partial).

 The function prototype should be:
 bool isMatch(const char *s, const char *p)

 Some examples:
 isMatch("aa","a") �� false
 isMatch("aa","aa") �� true
 isMatch("aaa","aa") �� false
 isMatch("aa", "a*") �� true
 isMatch("aa", ".*") �� true
 isMatch("ab", ".*") �� true
 isMatch("aab", "c*a*b") �� true
 */
public class Leet_10 {
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()) return s.isEmpty();
        if(p.length()==1)
            return (s.length()==1&&(p.charAt(0)=='.'||p.charAt(0)==s.charAt(0)));
        if(p.charAt(1)!='*'){
            if(s.isEmpty())  return false;
            return (s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')&&isMatch(s.substring(1),p.substring(1));
        }
        while(!s.isEmpty()&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')){
            if(isMatch(s,p.substring(2))) return true;
            s=s.substring(1);
        }
        return isMatch(s,p.substring(2));
    }
    public static void main(String args[]){
        System.out.println(new Leet_10().isMatch("a",".*..a*"));
    }
}
