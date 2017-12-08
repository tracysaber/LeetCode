/**
 * Created by tracysaber on 2017-12-8.
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class Leet_104 {
    public int maxDepth(TreeNode root) {
        if(root==null)  return 0;
        else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        System.out.println(new Leet_104().maxDepth(root));
    }
}
