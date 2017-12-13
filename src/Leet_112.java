/**
 * Created by tracysaber on 2017-12-13.
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 5
 / \
 4   8
 /   / \
 11  13  4
 /  \      \
 7    2      1
 return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class Leet_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root!=null){
            if(root.left==null&&root.right==null)   return sum==root.val;
            return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
        }
        else
            return false;
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        System.out.print(new Leet_112().hasPathSum(root,22));
    }
}
