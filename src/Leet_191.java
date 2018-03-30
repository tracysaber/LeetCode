/**
 * Created by tracysaber on 2018-2-25.
 * Write a function that takes an unsigned integer and returns the number of ¡¯1' bits it has (also known as the Hamming weight).

 For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class Leet_191 {
    public int hammingWeight(int n) {
        int result = 0;
        for(int i=0;i<32;i++){

            result += (n&1)==1?1:0;
            n = n>>>1;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.print(new Leet_191().hammingWeight(11));
    }
}
