/**
 * created by tracysaber
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

 For example, given the range [5, 7], you should return 4.
 */
public class Leet_201 {
	public int rangeBitwiseAnd(int m, int n) {
		int mask = -1;
		for(int i=0;i<32;i++){
			if((m&mask)==(n&mask))
				return m&mask;
			else
				mask=mask<<1;
		}
		return 0;
	}
	public static void main(String args[]){
		System.out.print(new Leet_201().rangeBitwiseAnd(5,7));
	}
}
