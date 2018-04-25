/**
 * Invert a binary tree.

 4
 /   \
 2     7
 / \   / \
 1   3 6   9
 to

 4
 /   \
 7     2
 / \   / \
 9   6 3   1
 Trivia:
 This problem was inspired by this original tweet by Max Howell:

 Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
 */
public class Leet_226 {
	public TreeNode invertTree(TreeNode root) {
		if(root==null)	return root;
		TreeNode it = root;
		if(it.left!=null||it.right!=null){
			TreeNode temp = it.left;
			it.left = it.right;
			it.right = temp;
			it.left = invertTree(it.left);
			it.right = invertTree(it.right);
		}
		return root;
	}
}
