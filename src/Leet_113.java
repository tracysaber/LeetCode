import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 5
 / \
 4   8
 /   / \
 11  13  4
 /  \    / \
 7    2  5   1
 return
 [
 [5,4,11,2],
 [5,8,4,5]
 ]

 */
public class Leet_113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		getPath(root,result,new LinkedList<Integer>(),sum);
		return  result;
	}
	public void getPath(TreeNode node,List<List<Integer>> result,List<Integer> path,int sum){
		if(node==null){
			return;
		}
		else{
			if(node.left==null&&node.right==null){
				if(sum==node.val){
					List<Integer> element = new LinkedList<Integer>(path);
					element.add(sum);
					result.add(element);
				}
			}
			else{
				path.add(node.val);
				getPath(node.left,result,new LinkedList<Integer>(path),sum-node.val);
				getPath(node.right,result,new LinkedList<Integer>(path),sum-node.val);
			}
		}
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		List<List<Integer>> a = new Leet_113().pathSum(root,22);
	}
}
