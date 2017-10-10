/**
 * Created by tracysaber on 2017-10-10.
 * Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements of nums being 2.
 */
public class Leet_27 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0 ; i< len; ++i){
            while (nums[i]==val && i< len) {
                nums[i]=nums[--len];
            }
        }
        return len;
    }
    public static void main(String args[]){
        int nums[]={3,2,2,3};
        int l= new Leet_27().removeElement(nums,3);
    }
}
