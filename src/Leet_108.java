/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


 Example:

 Given the sorted array: [-10,-3,0,5,9],

 One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

 0
 / \
 -3   9
 /   /
 -10  5
 */
public class Leet_108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode root = new TreeNode(0);
		if(nums.length==0)	return null;
		if(nums.length==1)	{
			root.val = nums[0];
			return root;
		}
		int low =0,high =nums.length-1;
		toBST(nums,low,high,root);
		return root;
	}
	public void toBST(int []nums,int low,int high,TreeNode node){
		if(low==high) {
			node.val = nums[low];
			return ;
		}
		int mid = low + (high -low)/2;
		if(mid==low){
			node.val = nums[low];
			node.right = new TreeNode(nums[high]);
		}
		else{
			node.val = nums[mid];
			node.left = new TreeNode(0);
			toBST(nums,low,mid-1,node.left);
			node.right = new TreeNode(0);
			toBST(nums,mid+1,high,node.right);
		}
	}
}
