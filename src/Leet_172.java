/**
 * Created by tracysaber on 2018-2-6.
 * Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.
 */
public class Leet_172 {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
    public static void main(String args[]){
        System.out.println(new Leet_172().trailingZeroes(1808548329));
        System.out.println(1808548329/5);
        System.out.println(1808548330/5);
    }
}
