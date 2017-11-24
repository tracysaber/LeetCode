import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-11-24.
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

 You should preserve the original relative order of the nodes in each of the two partitions.

 For example,
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.
 */
public class Leet_86 {
    public ListNode partition(ListNode head, int x) {
        List<Integer> firstit = new LinkedList<Integer>();
        ListNode it =head;
        int index=0;
        while(it!=null){
            int a = it.val;
            if(a>=x){
                firstit.add(a);
            }
            else{
                firstit.add(index++,a);
            }
            it = it.next;
        }
        it = head;
        index=0;
        while (it!=null){
            it.val=firstit.get(index++);
            it = it.next;
        }
        return  head;
    }
    public static void main(String []args){
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(8-i);
            it.next = a;
            it = a;
        }
        ListNode a = new Leet_86().partition(count,6);
    }
}
