/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

 Note: Do not modify the linked list.

 Follow up:
 Can you solve it without using extra space?
 */
public class Leet_142 {
	public ListNode detectCycle(ListNode head) {
		if(head==null || head.next==null)	return null;
		ListNode first =head,second = head;
		boolean isCycle = false;
		while(first!=null&&second!=null){
			first = first.next;
			if (second.next==null)	return null;
			second = second.next.next;
			if(first==second){
				isCycle = true;
				break;
			}
		}
		if(!isCycle) return null;
		first = head;
		while(first!=second){
			first = first.next;
			second = second.next;
		}
		return first;
	}
}
