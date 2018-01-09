import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
 \
 2
 /
 3
 return [1,2,3].
 */
public class Leet_144 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		if(root==null)	return result;
		Stack<TreeNode> stack = new Stack <TreeNode>();
		stack.add(root);
		while(!stack.isEmpty()){
			TreeNode now = stack.pop();
			result.add(now.val);
			if(now.right!=null)	stack.add(now.right);
			if(now.left !=null)	stack.add(now.left);
		}
		return result;
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(2);
		root.right = new TreeNode(3);
		List<Integer> a = new Leet_144().preorderTraversal(root);
	}
}
