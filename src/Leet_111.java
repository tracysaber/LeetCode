/**
 * Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class Leet_111 {
	public int minDepth(TreeNode root) {
		if(root==null)	return 0;
		else{
			if(root.left==null&&root.right==null)	return 1;
			else{
				if(root.left!=null&&root.right!=null)	return 1+Math.min(minDepth(root.left),minDepth(root.right));
				if(root.left!=null)	return 1+minDepth(root.left);
				else return 1+minDepth(root.right);
			}
		}
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(0);
		//root.right = new TreeNode(0);
		root.left = new TreeNode(0);
		root.left.left = new TreeNode(0);
		System.out.println(new Leet_111().minDepth(root));
	}
}
