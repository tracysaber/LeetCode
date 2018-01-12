
/**
 * Created by tracysaber on 2018-1-11.
 * Sort a linked list using insertion sort.
 */
public class Leet_147 {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode sorted=head,insert=head.next;
        head.next=null;
        while(insert!=null){
            sorted = insertInto(sorted,insert.val);
            insert = insert.next;
        }
        return sorted;
    }
    public ListNode insertInto(ListNode start,int value){
        ListNode it = start;
        ListNode  v= new ListNode(value);
        if(value<it.val){
            v.next = it;
            start =v;
        }
        else{
            while(it.next!=null&&it.next.val<value) it = it.next;
            v.next = it.next;
            it.next = v;
        }
        return start;
    }
    public static void main(String args[]){
        ListNode first = new ListNode(4);
        first.next = new ListNode(2);
        first.next.next= new ListNode(1);
        first.next.next.next = new ListNode(5);
        ListNode a = new Leet_147().insertionSortList(first);
    }
}
