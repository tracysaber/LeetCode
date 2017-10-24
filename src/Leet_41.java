/**
 * Created by tracysaber on 2017-10-23.
 * Given an unsorted integer array, find the first missing positive integer.

 For example,
 Given [1,2,0] return 3,
 and [3,4,-1,1] return 2.

 Your algorithm should run in O(n) time and uses constant space.
 */
public class Leet_41 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)
            return 1;
        int i=0;
        while(i<nums.length){
            if(nums[i]==i+1||nums[i]>nums.length||nums[i]<=0){
                i++;
            }
            else {
                if(nums[i]!=nums[nums[i]-1])
                    swap(nums,i,nums[i]-1);
                else
                    i++;
            }
        }
        i=0;
        while(i<nums.length){
            if(nums[i]!=i+1)
                return i+1;
            i++;
        }
        return nums.length+1;
    }
    public void swap(int[] A, int a,int b){
        int temp = A[a];
        A[a]=A[b];
        A[b] = temp;
    }
    public static void main(String args[]){
        int a[]={1,1};
        System.out.println(new Leet_41().firstMissingPositive(a));
    }
}
