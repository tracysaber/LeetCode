import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class Leet_23 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1)
            return null;
        if(lists.length==1)
            return lists[0];
        if(lists.length==2)
            return mergeTwoLists(lists[0],lists[1]);
        else{
            List<ListNode> l= Arrays.asList(lists);
            List<ListNode> ls= new ArrayList<ListNode>(l);
            while(ls.size()>2){
                ListNode l1 = ls.get(0);
                ListNode l2 = ls.get(1);
                ListNode node =mergeTwoLists(l1,l2);
                ls.remove(0);
                ls.remove(0);
                ls.add(node);
            }
            return mergeTwoLists(ls.get(0),ls.get(1));
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
        ListNode l[]={new ListNode(2),null,new ListNode(-1)};
        ListNode re = new Leet_23().mergeKLists(l);
        System.out.println();
    }
}
