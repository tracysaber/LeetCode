/**
 * @author tracysaber
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class Leet_53 {
	public int maxSubArray(int[] nums) {
		int dp[] = new int[nums.length];
		dp[0]=nums[0];
		int max = dp[0];
		for(int i =1;i<dp.length;i++){
			dp[i]= nums[i]+ (dp[i-1]> 0 ? dp[i-1]:0 );
			max = Math.max(max,dp[i]);
		}
		return max;
	}
	public static void main(String args[]){
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new Leet_53().maxSubArray(a));
	}
}
