/**
 * Additive number is a string whose digits can form additive sequence.

 A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

 Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.

 Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.

 Example 1:

 Input: "112358"
 Output: true
 Explanation: The digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 Example 2:

 Input: "199100199"
 Output: true
 Explanation: The additive sequence is: 1, 99, 100, 199.
 1 + 99 = 100, 99 + 100 = 199
 */
public class Leet_306 {
	public boolean judgeAdd(String first,String second,String num){
		String sum =String.valueOf((long)Integer.parseInt(first)+Integer.parseInt(second));
		if(num.length()==sum.length()&&num.equals(sum))
			return true;
		else{
			if(num.length()>sum.length()&&num.substring(0,sum.length()).equals(sum))
				return judgeAdd(second,sum,num.substring(sum.length()));
			else
				return false;
		}

	}
	public boolean isAdditiveNumber(String num) {
		if(num.length()<3) return false;
		int threshold = num.length()/3;
		for(int i =1;i<=threshold+1;i++){
			String first = num.substring(0,i);
			if(first.length()>1&&first.charAt(0)=='0') break;
			for(int j=i+1;j<=i+(num.length()-i)/2;j++){
				String second = num.substring(i,j);
				if(second.length()>1&&second.charAt(0)=='0') break;
				if(judgeAdd(first,second,num.substring(j)))
					return true;
//				String sum = String.valueOf(Integer.parseInt(first)+Integer.parseInt(second));
//				if(num.substring(j,Math.min(j+sum.length()+1,num.length()+1)).equals(sum)){
//					judgeAdd(second,sum,num.substring());
//				}
			}
		}
		return false;
	}
	public static void main(String args[]){
		System.out.print(new Leet_306().isAdditiveNumber("121474836472147483648"));
	}
}
