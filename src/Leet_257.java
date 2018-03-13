import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.

 For example, given the following binary tree:

 1
 /   \
 2     3
 \
 5
 All root-to-leaf paths are:

 ["1->2->5", "1->3"]
 */
public class Leet_257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String > result = new LinkedList<String>();
		StringBuilder string = new StringBuilder();
		if(root!=null){
			string.append(root.val);
			if(root.left!=null)
				findPath(result,string,root.left);
			if(root.right!=null)
				findPath(result,string,root.right);
			if(root.left==null&&root.right==null)	result.add(string.toString());
		}

		return result;
	}
	public void  findPath(List<String> re,StringBuilder now,TreeNode node){
		StringBuilder path = new StringBuilder(now);
		path.append("->");
		path.append(node.val);

		if(node.left==null&&node.right==null){
			if(path!=null)
				re.add(path.toString());
			return;
		}
		if(node.left!=null){
			//StringBuilder left = new StringBuilder(now);
			findPath(re,path,node.left);
		}
		if(node.right!=null){
			//StringBuilder right = new StringBuilder(now);
			findPath(re,path,node.right);
		}
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		List<String > a = new Leet_257().binaryTreePaths(root);
	}
}
