/**
 * Follow up for "Find Minimum in Rotated Sorted Array":
 What if duplicates are allowed?

 Would this affect the run-time complexity? How and why?
 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 Find the minimum element.

 The array may contain duplicates.


 */
public class Leet_154 {
	public int findMin(int[] nums) {
		if(nums[0]==nums[nums.length-1])	{
			int min =nums[0];
			for(int i=0;i<nums.length;i++){
				min = Math.min(min,nums[i]);
			}
			return min;
		}
		return getMin(nums,0,nums.length-1);
	}
	public int getMin(int []nums,int start,int end){
		if(nums[start]<nums[end])	return nums[start];
		else{
			if(end==start+1||end==start)	return nums[end];
			else{
				int mid = start + (end-start)/2;
				if(nums[mid]>=nums[start])	return getMin(nums,mid,end);
				else return getMin(nums,start,mid);
			}
		}
	}
	public static void main(String args[]){
		int nums[] ={1};
		System.out.println(new Leet_153().findMin(nums));
	}
}
