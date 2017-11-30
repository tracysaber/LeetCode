import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by tracysaber on 2017-11-30.
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
 \
 2
 /
 3
 return [1,3,2].
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
     }
public class Leet_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        getInorder(root,result);
        return result;
    }
    public void getInorder(TreeNode t,List<Integer> list){
        if (t==null)    return;
        if(t.left!=null)
            getInorder(t.left,list);
        list.add(t.val);
        if(t.right!=null)
            getInorder(t.right,list);
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> A = new Leet_94().inorderTraversal(root);
    }
}
