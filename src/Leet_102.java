import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
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
        TreeNode it = root;
        while(it!=null){
            Queue<TreeNode> a = new LinkedBlockingQueue<TreeNode>();
            a.add(it);
        }
        return result;
    }
    public void getOrder(List<List<Integer>> result,TreeNode node,Queue<TreeNode> queue){
        
    }
}
