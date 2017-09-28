/**
 * Created by tracysaber on 2017-9-27.
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Leet_9 {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        boolean flag = true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(new Leet_9().isPalindrome(123546));
    }
}
