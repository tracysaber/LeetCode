import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by tracysaber on 2017-12-7.
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]

 */
public class Leet_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedBlockingQueue<TreeNode>();
        if(root==null)  return result;
        else q.add(root);
        while(!q.isEmpty()){
            List<Integer> element = new LinkedList<Integer>();
            Queue<TreeNode> newqueue = new LinkedBlockingQueue<TreeNode>();
            while(!q.isEmpty()){
                TreeNode t = q.poll();
                element.add(t.val);
                if(t.left!=null)    newqueue.add(t.left);
                if(t.right!=null)    newqueue.add(t.right);
            }
            result.add(element);
            q = new LinkedBlockingQueue<TreeNode>(newqueue);
        }
        return result;
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> a = new Leet_102().levelOrder(root);
    }
}
