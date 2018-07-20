import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Given a list of non negative integers, arrange them such that they form the largest number.

 Example 1:

 Input: [10,2]
 Output: "210"
 Example 2:

 Input: [3,30,34,5,9]
 Output: "9534330"
 Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class Leet_179 {
	public String largestNumber(int[] nums) {
		Integer[] newArray = new Integer[nums.length];
		int i = 0;
		for (int value : nums) {
			newArray[i++] = Integer.valueOf(value);
		}
		Arrays.sort(newArray,new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				String num1 = a.toString();
				String num2 = b.toString();
				int times = Math.min(num1.length(),num2.length());
				for(int i =0;i<times;i++){
					if(num1.charAt(i)>num2.charAt(i))	return -1;
					if(num1.charAt(i)<num2.charAt(i))	return 1;
				}
				if(num1.length()>num2.length())
					return num1.charAt(num2.length())>num2.charAt(0)?-1:1;
				if(num1.length()<num2.length())
					return num2.charAt(num1.length())>num1.charAt(0)?1:-1;
				else
					return 0;
			}
		});
		StringBuilder s = new StringBuilder();
		for(Integer a:newArray){
			s.append(a.toString());
		}
		int index=0;
		for(i =0;i<s.length();i++) {
			if (s.charAt(i) == '0')
				index++;
			else
				break;
		}
		return s.substring(index).length()==0?"0":s.substring(index).toString();
	}
	public static void main(String args[]){
		//Set<Integer> a  = new Set
		//ArrayDeque
		int a[]={4704,6306,9385,7536,3462,4798,5422,5529,8070,6241,9094,
				7846,663,6221,216,6758,8353,3650,3836,8183,3516,5909,6744,
				1548,5712,2281,3664,7100,6698,7321,4980,8937,3163,5784,3298,
				9890,1090,7605,1380,1147,1495,3699,9448,5208,9456,3846,3567,
				6856,2000,3575,7205,2697,5972,7471,1763,1143,1417,6038,2313,
				6554,9026,8107,9827,7982,9685,3905,8939,1048,282,7423,6327,
				2970,4453,5460,3399,9533,914,3932,192,3084,6806,273,4283,2060,
				5682,2,2362,4812,7032,810,2465,6511,213,2362,3021,2745,3636,6265,1518,8398};
		System.out.println(new Leet_179().largestNumber(a));
	}
}
