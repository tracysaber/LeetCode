import java.util.Stack;

/**
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.


 Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].


 The largest rectangle is shown in the shaded area, which has area = 10 unit.

 For example,
 Given heights = [2,1,5,6,2,3],
 return 10.
 */
public class Leet_84 {
//	public int largestRectangleArea(int[] heights) {
//		if(heights.length==0)
//			return 0;
//		int max =0;
//		for(int i =0;i<heights.length;i++){
//			if(heights[i]>0){
//				max = Math.max(max,maxPoint(heights,i));
//			}
//		}
//		return max;
//	}
//	int maxPoint(int []h,int index){
//		int max = 0;
//		int kuan = h[index];
//		for(int i=index;i<h.length;i++){
//			if(h[i]>0){
//				kuan = Math.min (kuan,h[i]);
//				max = Math.max(max,kuan*(i-index+1));
//			}
//			else return max;
//		}
//		return max;
//	}
public int largestRectangleArea(int[] height) {
	int len = height.length;
	Stack<Integer> s = new Stack<Integer>();
	int maxArea = 0;
	for(int i = 0; i <= len; i++){
		int h = (i == len ? 0 : height[i]);
		if(s.isEmpty() || h >= height[s.peek()]){
			s.push(i);
		}else{
			int tp = s.pop();
			maxArea = Math.max(maxArea, height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
			i--;
		}
	}
	return maxArea;
}
	public static void main(String []args){
		int a[]={2,1,5,6,2,3};
		System.out.println(new Leet_84().largestRectangleArea(a));
	}
}
