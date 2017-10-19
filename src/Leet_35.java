/**
 * Created by tracysaber on 2017-10-18.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 ¡ú 2
 [1,3,5,6], 2 ¡ú 1
 [1,3,5,6], 7 ¡ú 4
 [1,3,5,6], 0 ¡ú 0
 */
public class Leet_35 {
    public int searchInsert(int[] nums, int target) {
        int start =0 ;
        int end =nums.length;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end =mid;
            }
        }
        if(start==nums.length)
            return start;
        if(nums[start]<target)
            return start+1;
        else
            return start;
    }
    public static void main(String args[]){
        int nums[]={1,3,5};
        System.out.println(new Leet_35().searchInsert(nums,4));
    }
}
