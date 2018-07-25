/**
 * Created by tracysaber on 2018-7-25.
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.



 Example 1:

 Input: "Hello"
 Output: "hello"
 Example 2:

 Input: "here"
 Output: "here"
 Example 3:

 Input: "LOVELY"
 Output: "lovely"

 */
public class Leet_709 {
    public String toLowerCase(String str) {
        StringBuilder lowerString = new StringBuilder();
        for(int i=0;i<str.length();i++){
            Character now = str.charAt(i);
            if('A'<=now&&'Z'>=now){
                now = (char)(now+32);
            }
            lowerString.append(now);
        }
        return lowerString.toString();
    }
    public static void main(String args[]){
        System.out.println(new Leet_709().toLowerCase("HKLHJWLi"));
    }
}
