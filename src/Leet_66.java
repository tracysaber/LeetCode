import java.util.LinkedList;
import java.util.List;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class Leet_66 {
	public int[] plusOne(int[] digits) {
		List<Integer> result = new LinkedList<Integer>();
		int last = digits[digits.length-1]+1;
		int flag = last ==10 ?1:0;
		if(digits.length==1){
			if(flag==1){
				int r[]={1,0};
				return r;
			}
			else{
				int r[]={digits[0]+1};
				return r;
			}
		}
		result.add((last%10));
		for(int i=digits.length-2;i>=0;i--){
			int num = digits[i] +flag;
			flag = num==10?1:0;
			result.add(0,(num%10));
		}
		if(flag==1)
			result.add(0,1);
		int re [] =new int[result.size()];
		for(int i =0;i<re.length;i++){
			re[i] = result.get(i);
		}
		return re;
	}
	public static void main(String args[]){
		int a[]={9,9,1,2};
		int b[] = new Leet_66().plusOne(a);
	}
}
