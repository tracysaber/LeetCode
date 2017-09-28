/**
 * Created by tracysaber on 2017-9-28.
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

 Note: You may not slant the container and n is at least 2.
 */
public class Leet_11 {
    public int maxArea(int[] height) {
        int max_area=0;
        int left=0,right=height.length-1;
        while(right>left){
            max_area = Math.max(max_area,Math.min(height[left],height[right])*(right-left));
            if(height[right]>height[left])
                left++;
            else
                right--;
        }
        return max_area;
    }
    public static void main(String args[]){
        int height[]={1,2,3,4};
        System.out.println(new Leet_11().maxArea(height));
    }
}
