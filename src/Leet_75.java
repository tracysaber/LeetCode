/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 Note:
 You are not suppose to use the library's sort function for this problem.
 */
public class Leet_75 {
	public void sortColors(int[] nums) {
		int count[] = {0,0,0};
		for(int i =0;i<nums.length;i++){
			count[nums[i]]++;
		}
		int index =0;
		for(int i=0;i<3;i++){
			for(int j=0;j<count[i];j++){
				nums[index++]=i;
			}
		}
	}
	public static void main(String args[]){
		int a[]={0,0,1,2,2,2,1,0,1};
		new Leet_75().sortColors(a);
	}
}
