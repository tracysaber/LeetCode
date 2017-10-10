/**
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */

public class Leet_24 {
    public ListNode swapPairs(ListNode head) {
        if(head ==null)
            return null;
        if(head.next==null)
            return head;
        else{
            int swap=head.val;
            head.val = head.next.val;
            head.next.val = swap;
            head.next.next = swapPairs(head.next.next);
            return head;
        }
    }
    public static void main(String args[]){

    }
}
