/**
 * Created by tracysaber on 2017-12-12.
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


 Example:

 Given the sorted linked list: [-10,-3,0,5,9],

 One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

 0
 / \
 -3   9
 /   /
 -10  5

 */
public class Leet_109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return  null;
        else
            return creatBST(head,null);
    }
    public TreeNode creatBST(ListNode left,ListNode right){
        if(left==right) return null;
        ListNode fast = left,slow = left;
        while(fast!=right&&fast.next!=right){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode node = new TreeNode(slow.val);
        node.left = creatBST(left,slow);
        node.right = creatBST(slow.next,right);
        return node;
    }
    public static void main(String args[]){
        ListNode count = new ListNode(-10);
        ListNode it =count;
        for(int i=0;i < 5;i++){
            ListNode a=new ListNode(i);
            it.next = a;
            it = a;
        }
        TreeNode root = new Leet_109().sortedListToBST(count);
    }
}
