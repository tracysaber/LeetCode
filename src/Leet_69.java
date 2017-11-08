/**
 * Created by tracysaber on 2017-11-8.
 * Implement int sqrt(int x).

 Compute and return the square root of x.

 x is guaranteed to be a non-negative integer.


 Example 1:

 Input: 4
 Output: 2
 Example 2:

 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated.

 */
public class Leet_69 {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
    public static void main(String args[]){
        System.out.println(new Leet_69().mySqrt(2147395599));
    }
}
