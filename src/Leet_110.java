/**
 * Created by tracysaber on 2017-12-12.
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class Leet_110 {
    public boolean isBalanced(TreeNode root) {
        if(root!=null){
            int left = getHeighth(root.left);
            int right = getHeighth(root.right);
            return Math.abs(left-right)<=1&&isBalanced(root.left)&&isBalanced(root.right);
        }
        return true;
    }
    public int getHeighth(TreeNode node){
        int h =0;
        if(node==null)  return h;
        else{
            return h+1+Math.max(getHeighth(node.left),getHeighth(node.right));
        }
    }
}
