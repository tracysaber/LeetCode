/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

 Example 1:

 Input: [3,2,1,5,6,4] and k = 2
 Output: 5
 Example 2:

 Input: [3,2,3,1,2,4,5,5,6] and k = 4
 Output: 4
 Note:
 You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class Leet_215 {
	private int findKth(int []nums,int low ,int high){
		int temp = nums[low];
		while(low<high){
			while(low<high&&nums[high]<=temp){
				high--;
			}
			nums[low]=nums[high];
			while(low<high&&nums[low]>=temp){
				low++;
			}
			nums[high]=nums[low];
		}
		nums[low]=temp;
		return low;
	}
	private void _findKth(int []nums,int k,int low,int high){
		int index = findKth(nums,low,high);
		if (k<index){
			_findKth(nums,k,low,index);
		}
		if(k>index){
			_findKth(nums,k,index+1,high);
		}
	}
	public int findKthLargest(int[] nums, int k) {
		_findKth(nums,k-1,0,nums.length-1);
		return nums[k-1];
	}
	public static void main(String args[]){
		int a[]={3,2,3,1,2,4,5,5,6};
		System.out.println(new Leet_215().findKthLargest(a,4));
	}
}
