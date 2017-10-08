/**
 * Created by tracysaber on 2017-10-8.
 *
 * Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.
 */



public class Leet_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode count=head;
        int length=0;
        while(count!=null){
            length++;
            count=count.next;
        }
        int no= length-n;
        count=head;
        if(no==0)
            return head.next;
        else{
            for(int i=0;i<length-n-1;i++){
                count=count.next;
            }
            count.next=count.next.next;
            return head;
        }

    }
    public static void main(String args[]){
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i);
            it.next = a;
            it = a;
        }
        ListNode re = new Leet_19().removeNthFromEnd(count,5);
        System.out.println(re.val);
    }
}
