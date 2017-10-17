/**
 * Created by tracysaber on 2017-10-17.
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

 Your algorithm's runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 For example,
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].
 */
public class Leet_34 {
    public int[] searchRange(int[] nums, int target) {
        int start = firstShow(nums,target);
        if(start==nums.length||nums[start]!=target){
            return new int[]{-1,-1};
        }
        else
            return new int[]{start,firstShow(nums,target+1)-1};
    }
    public int firstShow(int []nums,int target){
        int low =0;
        int high = nums.length;
        while(low<high){
            int mid = (high+low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String args[]){

    }
}
