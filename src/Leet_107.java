import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]

 */
public class Leet_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root==null) return result;
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> list = new LinkedList<Integer>();
			for(int i =0;i<size;i++){
				TreeNode now = queue.poll();
				if(now.left!=null)	queue.offer(now.left);
				if(now.right!=null) queue.offer(now.right);
				list.add(now.val);
			}
			result.add(0,list);
		}
		return result;
	}
}
