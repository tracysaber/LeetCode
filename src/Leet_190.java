/**
 * Created by tracysaber on 2018-2-24.
 * Reverse bits of a given 32 bits unsigned integer.

 For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

 Follow up:
 If this function is called many times, how would you optimize it?
 */
public class Leet_190 {
    public int reverseBits(int n) {
        int result =0;
        for(int i =0;i<32;i++){
            result += n&1;
            n >>>= 1;
            if(i<31)
                result <<= 1;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.print(new Leet_190().reverseBits(43261596));
    }
}
