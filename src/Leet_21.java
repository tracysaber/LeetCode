/**
 * Created by tracysaber on 2017-10-8.
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class Leet_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val<=l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return  l1;
        }
        else{
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
    }
    public static void main(String args[]){
        ListNode c1 = new ListNode(0);
        ListNode c2 = new ListNode(0);
        ListNode it1 =c1;
        ListNode it2 =c2;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i);
            it1.next = a;
            it1=a;
            ListNode b=new ListNode(i);
            it2.next = b;
            it2 = b;
        }
        ListNode ll= new Leet_21().mergeTwoLists(c1,c2);
        System.out.println();
    }
}
