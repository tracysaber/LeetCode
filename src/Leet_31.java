/**
 * Created by tracysaber on 2017-10-16.
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

 If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

 The replacement must be in-place, do not allocate extra memory.

 Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 1,2,3 ¡ú 1,3,2
 3,2,1 ¡ú 1,2,3
 1,1,5 ¡ú 1,5,1
 */
public class Leet_31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n<=1)
            return ;
        int i = n -2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums,i+1,n-1);
    }
    public void swap(int n[],int a,int b){
        int s = n[a];
        n[a]=n[b];
        n[b]=s;
    }
    public void reverse(int []n,int start,int end){
        while(end>start)
            swap(n,start++,end--);
    }
    public static void main(String args[]){
        int a[]={1,1,5};
        new Leet_31().nextPermutation(a);
    }
}
