/**
 * Created by tracysaber on 2017-12-7.
 * Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.
 Example 1:
 2
 / \
 1   3
 Binary tree [2,1,3], return true.
 Example 2:
 1
 / \
 2   3
 Binary tree [1,2,3], return false.
 */
public class Leet_98 {
    public boolean isValidBST(TreeNode root) {
        //if(root!=null&&root.left==null&&root.right==null)   return true;
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValid(TreeNode treeNode,long min,long max){
        if(treeNode==null)  return true;
        if(treeNode.val>=max||treeNode.val<=min)  return false;
        return isValid(treeNode.left,min,treeNode.val)&&isValid(treeNode.right,treeNode.val,max);
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(-2147483648);
        root.right = new TreeNode(2147483647);
        //root.right = new TreeNode(3);
       // [-2147483648,null,2147483647]
        System.out.println(new Leet_98().isValidBST(root));
        //System.out.println(Integer.MAX_VALUE);
    }
}
