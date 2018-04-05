/**
 * Created by tracysaber on 2018-4-5.
 * Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class Leet_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode post = head;
        while(post!=null){
            if(post.val==val){
                if(post.next!=null){
                    post.val= post.next.val;
                    post.next = post.next.next;
                }
                else
                    post=null;
            }
            else
                post = post.next;
        }
        return head;
    }
    public static void main(String args[]){
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i);
            it.next = a;
            it = a;
        }
        it.next = new ListNode(0);
        new Leet_203().removeElements(count,0);
        System.out.println();
    }
}
