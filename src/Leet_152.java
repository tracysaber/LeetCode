/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.
 */
public class Leet_152 {
	public int maxProduct(int[] nums) {
		if(nums.length==0)	return 0;
		int max=nums[0],min=nums[0],result=nums[0];
		for(int i=1;i<nums.length;i++){
			int temp = max;
			max = Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
			min = Math.min(nums[i],Math.min(nums[i]*temp,nums[i]*min));
			if(max>result)	result=max;
		}
		return result;
	}
	public static void main(String args[]){
		int a []={-4,-3,-2};
		System.out.print(new Leet_152().maxProduct(a));
	}
}
