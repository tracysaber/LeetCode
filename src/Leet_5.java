/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:

 Input: "babad"

 Output: "bab"

 Note: "aba" is also a valid answer.
 Example:

 Input: "cbbd"

 Output: "bb"
 */
public class Leet_5 {
    private int maxLen,begin;
    public void isPalindroms(String s,int i,int j){
        while((i>=0)&&(j<s.length())&&(s.charAt(i)==s.charAt(j))){
            i--;
            j++;
        }
        if(j-i-1>maxLen){
            maxLen =j-i-1;
            begin = i+1;
        }
    }
    public String longestPalindrome(String s) {
        begin=0;
        int length = s.length();
        maxLen=0;
        if (s.length()==1)
            return s;
        for(int i=0;i<length-1;i++){
           isPalindroms(s,i,i);
           isPalindroms(s,i,i+1);
        }
        return s.substring(begin,begin+maxLen);
    }
    public static void main(String args[]){
        String s ="bb";
        System.out.println(new Leet_5().longestPalindrome(s));
    }
}
