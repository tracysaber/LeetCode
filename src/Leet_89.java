import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.

 Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

 For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

 00 - 0
 01 - 1
 11 - 3
 10 - 2
 Note:
 For a given n, a gray code sequence is not uniquely defined.

 For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

 For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.


 */
public class Leet_89 {
	public List<Integer> grayCode(int n) {
		List<Integer> result = new LinkedList<Integer>();
		if(n==0){
			result.add(0);
			return result;
		}
		if(n==1){
			result.add(0);
			result.add(1);
			return result;
		}
		else{
			result = grayCode(n-1);
			//Collections.reverse(result);
			int size = result.size();
			int base = (int)Math.pow(2,n-1);
			for(int i=0;i<size;i++){
				result.add(result.get(size-i-1)+base);
			}
		}
		return result;
	}
	public static void main(String args[]){
		List<Integer> a = new Leet_89().grayCode(2);
	}
}
