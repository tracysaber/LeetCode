import java.util.*;
/**
 * Created by tracysaber on 2017-12-8.
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
 ]
 */
public class Leet_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<TreeNode> a = new LinkedList<TreeNode>();
        if(root==null)  return result;
        else a.add(root);
        boolean flag = true;
        while(!a.isEmpty()){
            List<Integer> newelement = new LinkedList<Integer>();
            Stack<TreeNode> list = new Stack<TreeNode>();
            if(flag){
                for(int i=0;i<a.size();i++){
                    TreeNode it = a.get(i);
                    newelement.add(it.val);
                    if(it.left!=null)   list.push(it.left);
                    if(it.right!=null)   list.push(it.right);
                }
            }
            else{
                for(int i=a.size()-1;i>=0;i--){
                    TreeNode it = a.get(i);
                    TreeNode reit = a.get(a.size()-i-1);
                    newelement.add(it.val);
                    if(reit.left!=null)   list.push(reit.left);
                    if(reit.right!=null)   list.push(reit.right);
                }
            }
            flag = !flag;
            result.add(newelement);
            a = new LinkedList<TreeNode>(list);
        }
        return result;
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> a = new Leet_103().zigzagLevelOrder(root);
    }
}
