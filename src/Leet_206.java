import java.util.Stack;

/**
 * Reverse a singly linked list.
 */
public class Leet_206 {
	public ListNode reverseList(ListNode head) {
		Stack<Integer>  nums = new Stack<Integer>();
		ListNode iter = head;
		while(iter!=null){
			nums.push(iter.val);
			iter = iter.next;
		}
		iter = head;
		while(iter!=null){
			iter.val=nums.pop();
			iter = iter.next;
		}
		return head;
	}
}
