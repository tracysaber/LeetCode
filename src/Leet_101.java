import javax.swing.text.Style;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
 1
 / \
 2   2
 \   \
 3    3
 Note:
 Bonus points if you could solve it both recursively and iteratively.
 */
public class Leet_101 {
	public boolean isSymmetric(TreeNode root) {
		if(root==null)	return true;
		else{
			return isSy(root.left,root.right);
		}
	}
	public boolean isSy(TreeNode left,TreeNode right){
		if(left==null&&right==null)	return true;
		if(left!=null&&right!=null&&left.val==right.val )	return isSy(left.left,right.right)&&isSy(left.right,right.left);
		else{
			return false;
		}
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		System.out.println(new Leet_101().isSymmetric(root));
	}
}
