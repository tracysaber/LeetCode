/**
 * Created by tracysaber on 2017-10-17.
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.
 */
public class Leet_33 {
    public int search(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] ={4,5,6,7,8,0,1,2,3};
        int a = new Leet_33().search(nums,3);
    }
}
