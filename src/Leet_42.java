/**
 * Created by tracysaber on 2017-10-24.
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class Leet_42 {
    public int trap(int[] height) {
        if(height.length<3)
            return 0;
        int left =0 ;
        int right = height.length-1;
        int trap=0;
        while(left<height.length-1&&height[left+1]>=height[left]&&left<right) left++;
        while(right>0&&height[right-1]>=height[right]&&left<right) right--;
        while(left<right){
            int l=height[left];
            int r=height[right];
            if(l<r){
                while(height[++left]<l&&left<right){
                    trap+=l-height[left];
                }
            }
            else{
                while(height[--right]<r&&left<right){
                    trap +=r-height[right];
                }
            }
        }
        return trap;
    }
    public static void main(String args[]){
        int a[]={1,7,8};
        System.out.println(new Leet_42().trap(a));
    }
}
