import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Your goal is to reach the last index in the minimum number of jumps.

 For example:
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */
public class Leet_45 {
	public int jump(int[] nums) {
		if(nums.length<=1)
			return 0;
		int index=0;
		int steps=0;
		while(index<nums.length){
			int range = nums[index];
			if(index+range>=nums.length-1)
				return ++steps;
			int Max = 0;
			int next =0;
			for(int i =1;i<=range;i++){
				if((i+nums[i+index])>Max) {
					Max = i+nums[i+index];
					next = index + i;
				}
			}
			index = next;
			steps++;
		}
		return steps;
	}
	public static void main(String args[]){
		//Pattern a=Pattern.compile("([a-zA-Z_]([\-_a-zA-Z0-9])*){1,39}");
		//Matcher matcher=a.matcher("8");
		int a[]={2,3,1,1,4};
		System.out.println(new Leet_45().jump(a));

	}
}
