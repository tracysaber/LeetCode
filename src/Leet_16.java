import java.util.Arrays;
import java.util.Map;

/**
 * Created by tracysaber on 2017-10-4.
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 For example, given array S = {-1 2 1 -4}, and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

 */
public class Leet_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0]+nums[1]+nums[2];
        for(int i =0;i<nums.length-2;i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                min = (Math.abs(sum-target)< Math.abs(min-target))?sum:min;
                if(sum==target){
                    return target;
                }
                if(sum<target){
                    j++;

                }
                else{
                    k--;
                    //min = (Math.abs(sum-target)< Math.abs(min-target))?sum:min;
                }
            }
        }
        return min;
    }
    public static void main(String args[]){
        int s[]={-1,2,1,-4};
        System.out.println(new Leet_16().threeSumClosest(s,1));
    }
}
