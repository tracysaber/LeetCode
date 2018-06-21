/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

 Example 1:

 Input: [2,3,2]
 Output: 3
 Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
 because they are adjacent houses.
 Example 2:

 Input: [1,2,3,1]
 Output: 4
 Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 Total amount you can rob = 1 + 3 = 4.
 */
public class Leet_213 {
	public int rob(int[] nums) {
		int length = nums.length;
		if(length==0)	return 0;
		if(length%2==0){
			int sum1=0,sum2=0;
			for(int i=0;i<(length/2);i++){
				sum1+=nums[i*2];
				sum2+=nums[i*2+1];
			}
			return Math.max(sum1,sum2);
		}
		else{

		}
		return 0;
	}
}
