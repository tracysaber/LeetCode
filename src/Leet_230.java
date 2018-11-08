/***
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 Note:
 You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

 Example 1:

 Input: root = [3,1,4,null,2], k = 1
 3
 / \
 1   4
 \
 2
 Output: 1
 Example 2:

 Input: root = [5,3,6,2,4,null,null,1], k = 3
 5
 / \
 3   6
 / \
 2   4
 /
 1
 Output: 3
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leet_230 {
	public int kthSmallest(TreeNode root, int k) {
		int left_numbers = numbers(root.left);
		if(k-1>left_numbers)	return kthSmallest(root.right,k-left_numbers-1);
		else{
			if(k==left_numbers+1)	return root.val;
			else	return kthSmallest(root.left,k);
		}
	}
	public int numbers(TreeNode root){
		if(root!=null){
			return numbers(root.left)+1+numbers(root.right);
		}
		else	return 0;
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		System.out.println(new Leet_230().kthSmallest(root,1));
	}
}
