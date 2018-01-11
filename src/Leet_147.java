/**
 * Created by tracysaber on 2018-1-11.
 * Sort a linked list using insertion sort.
 */
public class Leet_147 {
    public ListNode insertionSortList(ListNode head) {

    }
    public ListNode insertInto(ListNode start,int value){
        ListNode it = start;
        ListNode  v= new ListNode(value);
        if(value<it.val){
            v.next = it;
            //return v;
        }
        else{
            while(it.next!=null&&it.next.val<value) it = it.next;
            v.next = it.next;
            it.next = v;
        }
        return v;
    }
}
