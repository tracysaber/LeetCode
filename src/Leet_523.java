/**
 * Created by tracysaber on 2018-7-25.
 * Given a list of non-negative numbers and a target integer k, write a function to check if the array has a continuous subarray of size at least 2 that sums up to the multiple of k, that is, sums up to n*k where n is also an integer.

 Example 1:
 Input: [23, 2, 4, 6, 7],  k=6
 Output: True
 Explanation: Because [2, 4] is a continuous subarray of size 2 and sums up to 6.
 Example 2:
 Input: [23, 2, 6, 4, 7],  k=6
 Output: True
 Explanation: Because [23, 2, 6, 4, 7] is an continuous subarray of size 5 and sums up to 42.
 */
public class Leet_523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(k==0){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==0&&nums[i+1]==0)    return true;
            }
            return false;
        }
        int results []= new int [nums.length];
        for(int i=0;i<nums.length;i++){
            results[i] = nums[i]%k;
            for(int j=i+1;j<nums.length;j++){
                results[j] = (results[j-1]+nums[j])%k;
                if(results[j]==0) return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int a[]={23, 2, 4, 6, 7};
        System.out.print(new Leet_523().checkSubarraySum(a,6));
    }
}
