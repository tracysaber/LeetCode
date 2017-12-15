/**
 * Given a binary tree, flatten it to a linked list in-place.

 For example,
 Given

 1
 / \
 2   5
 / \   \
 3   4   6
 The flattened tree should look like:
 1
 \
 2
 \
 3
 \
 4
 \
 5
 \
 6
 */
public class Leet_114 {
	public void flatten(TreeNode root) {
		if(root==null)	return ;
		else {
			if(root.left!=null){
				TreeNode max = findMax(root.left);
				max.right = root.right;
				root.right =root.left;
				root.left = null;
			}
			flatten(root.right);
		}
	}
	public TreeNode findMax(TreeNode node){
		while(node.right!=null)
			node = node.right;
		return node;
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);
		new Leet_114().flatten(root);
	}
}
