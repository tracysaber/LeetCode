import java.util.Random;

/**
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

 Follow up:
 What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

 Example:

 // Init a singly linked list [1,2,3].
 ListNode head = new ListNode(1);
 head.next = new ListNode(2);
 head.next.next = new ListNode(3);
 Solution solution = new Solution(head);

 // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 solution.getRandom();
 */
class Solution{
	ListNode head;
	Random random;

	public Solution(ListNode h) {
		head = h;
		random = new Random();
	}

	public int getRandom() {

		ListNode c = head;
		int r = c.val;
		for(int i=1;c.next != null;i++){

			c = c.next;
			if(random.nextInt(i + 1) == i) r = c.val;
		}

		return r;
	}
}
public class Leet_382 {
	public static void main(String args[]){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		Solution solution = new Solution(head);

		// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
		solution.getRandom();
		System.out.println();
	}
}
