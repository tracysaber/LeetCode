import java.util.AbstractQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth term of the count-and-say sequence.

 Note: Each term of the sequence of integers will be represented as a string.

 Example 1:

 Input: 1
 Output: "1"
 Example 2:

 Input: 4
 Output: "1211"

 */
public class Leet_38 {
    public String countAndSay(int n) {
        if(n==1)
            return new String("1");
        else {
            String ex = countAndSay(n - 1);
            char old = ex.charAt(0);
            int count =1;
            String result ="";
            for(int i=1;i<ex.length();i++){
                if(ex.charAt(i)==old)
                    count++;
                else{
                    result+=String.valueOf(count);
                    result+=old;
                    old = ex.charAt(i);
                    count=1;
                }
            }
            result+=String.valueOf(count);
            result+=old;
            return result;
        }
    }
    public static void main(String args[]){
        System.out.println(new Leet_38().countAndSay(5));
    }
}
