/**
 * Given a complete binary tree, count the number of nodes.

 Note:

 Definition of a complete binary tree from Wikipedia:
 In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

 Example:

 Input:
 1
 / \
 2   3
 / \  /
 4  5 6

 Output: 6

 */
public class Leet_222 {
//	public int count(TreeNode node,int num){
//		if(node!=null)	num++;
//		if(node.left!=null)
//	}
	public int countNodes(TreeNode root) {
		int result =0 ;
		if(root!=null) result++;
		else return result;
		if(root.left!=null) result+=countNodes(root.left);
		if(root.right!=null) result+=countNodes(root.right);
		return result;
	}

}
