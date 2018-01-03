import java.util.HashSet;
import java.util.List;

/**
 * Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?
 */
public class Leet_141 {
	public boolean hasCycle(ListNode head) {
		HashSet<ListNode> repeat = new HashSet<ListNode>();
		ListNode it = head;
		while(it!=null){
			if(!repeat.contains(it)) repeat.add(it);
			else return true;
			it = it.next;
		}
		return false;
	}
	public static void main(String args[]){
		ListNode root = new ListNode(10);
		root.next = new ListNode(30);
		root.next.next = root;
		System.out.println(new Leet_141().hasCycle(root));
	}
}
