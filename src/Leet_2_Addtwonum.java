import java.util.*;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class Leet_2_Addtwonum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode it =first;
        int add = 0;
        while(l1!=null||l2!=null||add==1){
            int sum = (l1!=null?l1.val:0)+(l2!=null?l2.val:0) + add;
            add = sum/10;
            sum = sum%10;
            ListNode new_node = new ListNode(sum);
            it.next =new_node;
            it = new_node;
            l1 = l1!=null?l1.next:l1;
            l2 = l2!=null?l2.next:l2;
        }
        return first.next;
    }
    public static void main(String args[]){
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i);
            it.next = a;
            it = a;
        }
        ListNode re = new Leet_2_Addtwonum().addTwoNumbers(count.next,count.next);
        System.out.println(re.val);
    }
}
