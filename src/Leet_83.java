/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */
public class Leet_83 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null)
			return head;
		ListNode it = head;
		while(it.next!=null){
			if(it.next.val == it.val){
				it.next = it.next.next;
			}
			else{
				it = it.next;
			}
		}
		return  head;
	}
	public static void main(String []args){
		ListNode count = new ListNode(0);
		ListNode it =count;
		for(int i=0;i < 4;i++){
			ListNode a=new ListNode(0);
			it.next = a;
			it = a;
		}
		ListNode re = new Leet_83().deleteDuplicates(count);
	}
}
