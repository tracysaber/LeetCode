/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.

 A = [3,2,1,0,4], return false.
 */
public class Leet_55 {
	public boolean canJump(int[] nums) {
		int index=0;
		if(nums.length==0||nums.length==1)
			return true;
		while(index<nums.length){
			if(index+nums[index]>=nums.length-1)
				return true;
			if(index<nums.length-1&&nums[index]==0)
				return false;
			int max =0 ;
			int next=index;
			for(int i =0;i<nums[index];i++){
				if(i+nums[index+i+1]+1>=max){
					next = index+i+1;
					max=i+nums[index+i+1]+1;
				}
			}
			index = next;
		}
		return false;
	}
	public static void main(String args[]){
		int a[] ={2,0,0};
		System.out.println(new Leet_55().canJump(a));
	}
}
