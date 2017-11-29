import java.util.Stack;

/**
 * Created by tracysaber on 2017-11-29.
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

 For example:
 Given 1->2->3->4->5->NULL, m = 2 and n = 4,

 return 1->4->3->2->5->NULL.

 Note:
 Given m, n satisfy the following condition:
 1 ¡Ü m ¡Ü n ¡Ü length of list.
 *
 */
public class Leet_92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode first=head,last ;
        Stack<Integer> s = new Stack<Integer>();
        int count = n-m+1;
        for(int i=0;i<m-1;i++){
            first = first.next;
        }
        last=first;
        for(int i=0;i<count;i++){
            s.push(first.val);
            first = first.next;
        }
        for(int i=0;i<count;i++){
            last.val = s.pop();
            last = last.next;
        }
        return head;
    }
    public static void main(String args[]){
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i+1);
            it.next = a;
            it = a;
        }
        ListNode b = new Leet_92().reverseBetween(count,2,4);
    }
}
