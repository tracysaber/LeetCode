/**
 * Created by tracysaber on 2017-11-4.
 * Given a list, rotate the list to the right by k places, where k is non-negative.

 For example:
 Given 1->2->3->4->5->NULL and k = 2,
 return 4->5->1->2->3->NULL.
 */
public class Leet_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null)
            return head;
        ListNode last = head;
        ListNode it = head;
        int num=1;
        while(last.next!=null){
            last=last.next;
            num++;
        }
        if(k>=num)
            return head;
        for(int i =0;i<num-k-1;i++){
            it = it.next;
        }
        ListNode newhead = it.next;
        it.next =null;
        last.next = head;
        return  newhead;
    }
    public static void main(String args[]){
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i+1);
            it.next = a;
            it = a;
        }
        ListNode a=new Leet_61().rotateRight(count,2);
    }
}
