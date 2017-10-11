/**
 * Created by tracysaber on 2017-10-11.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class Leet_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        else {
            int len = nums.length;
            for (int i = 1; i < len; i++) {
                if (nums[i] == nums[i - 1]) {
                    len--;
                    for (int j = i-1; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    i--;
                }
            }
            return len;
        }
    }
    public static void main(String args[]){
        int nums[]={1,1,1,2};
        int c= new Leet_26().removeDuplicates(nums);
        System.out.println();
    }
}
