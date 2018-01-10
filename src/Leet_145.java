import java.util.*;

/**
 * Created by tracysaber on 2018-1-9.
 * Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [3,2,1].
 */
public class Leet_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        if(root==null)  return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Set<TreeNode> arrived = new HashSet<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode now = stack.pop();
            if(!arrived.contains(now)){
                arrived.add(now);
                stack.push(now);
                if(now.right!=null) stack.push(now.right);
                if(now.left!=null) stack.push(now.left);
            }
            else{
                result.add(now.val);
            }
        }
        return result;
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> a = new Leet_145().postorderTraversal(root);
    }
}
