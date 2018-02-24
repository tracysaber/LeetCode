import java.util.*;

/**
 * Created by tracysaber on 2018-2-7.
 */
class BSTIterator {
    int head;
    List<Integer> result;
    public BSTIterator(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        result = new LinkedList<Integer>();
        Set<TreeNode> set = new HashSet<TreeNode>();
        if(root!=null)  s.push(root);
        while(!s.isEmpty()){
            TreeNode now = s.pop();
            if(!set.contains(now)){
                set.add(now);
                if(now.right!=null)  s.push(now.right);
                s.push(now);
                if(now.left!=null) s.push(now.left);
            }
            else{
                result.add(now.val);
            }
        }
        head =0;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(head>=result.size())   return false;
        else return true;
    }

    /** @return the next smallest number */
    public int next() {
        return result.get(head++);
    }
}
public class Leet_173 {
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        BSTIterator i = new BSTIterator(root);
        while(i.hasNext()){
            System.out.print(i.next());
        }
    }

}
