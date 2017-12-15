/**
 * Created by tracysaber on 2017-12-15.
 * Given a binary tree

 struct TreeLinkNode {
 TreeLinkNode *left;
 TreeLinkNode *right;
 TreeLinkNode *next;
 }
 Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

 Initially, all next pointers are set to NULL.

 Note:

 You may only use constant extra space.
 You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 For example,
 Given the following perfect binary tree,
 1
 /  \
 2    3
 / \  / \
 4  5  6  7
 After calling your function, the tree should look like:
 1 -> NULL
 /  \
 2 -> 3 -> NULL
 / \  / \
 4->5->6->7 -> NULL

 */
class TreeLinkNode {
         int val;
         TreeLinkNode left, right, next;
         TreeLinkNode(int x) { val = x; }
}
public class Leet_116 {
    public void connect(TreeLinkNode root) {
        if(root==null) return ;
        TreeLinkNode now = null;
        TreeLinkNode pre = root;
        while(pre.left!=null){
            now = pre;
            while(now!=null){
                now.left.next = now.right;
                if(now.next!=null)  now.right.next = now.next.left;
                now = now.next;
            }
            pre = pre.left;
        }
    }
}
