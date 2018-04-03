import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by tracysaber on 2018-4-3.
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

 For example:
 Given the following binary tree,
 1            <---
 /   \
 2     3         <---
 \     \
 5     4       <---
 You should return [1, 3, 4].
 */
public class Leet_199 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> levels = new LinkedList<TreeNode>(),next_level= new LinkedList<TreeNode>();
        List<Integer> results = new LinkedList<Integer>();
        if(root==null)  return results;
        levels.add(root);
        while(!levels.isEmpty()){
            TreeNode now = levels.poll();
            if(now.left!=null)  next_level.add(now.left);
            if(now.right!=null)  next_level.add(now.right);
            if(levels.isEmpty())
            {
                results.add(now.val);
                levels = next_level;
                next_level=new LinkedList<TreeNode>();
            }
        }
        return results;
    }
}
