import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class Leet_169 {
	public int majorityElement(int[] nums) {
		int half = nums.length/2;
		Map<Integer,Integer> num= new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(num.containsKey(nums[i])) num.put(nums[i],num.get(nums[i])+1);
			else num.put(nums[i],1);
			if(num.get(nums[i])>half)	return nums[i];
		}
		return half;
	}
	public static void main(String args[]){
		int a[]={6,5,5};
		System.out.println(new Leet_169().majorityElement(a));
	}
}
