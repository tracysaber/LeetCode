/**
 * Created by tracysaber on 2017-10-10.
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

 k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

 You may not alter the values in the nodes, only nodes itself may be changed.

 Only constant memory is allowed.

 For example,
 Given this linked list: 1->2->3->4->5

 For k = 2, you should return: 2->1->4->3->5

 For k = 3, you should return: 3->2->1->4->5

 */
public class Leet_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode it = head;
        int length =0;
        while(it!=null){
            it = it.next;
            length++;
        }
        int epoch = length/k;
        it=head;
        return null;
//        for(int i =0;i<epoch;i++){
//            int nums[] =new int[k/2];
//            for(int j=0;j<k;i++){
//                if(i<=k/2){
//                    nums[]
//                }
//            }
//        }
//        while(it!=null){
//            int swap = it.val;
//            ListNode forward = it;
//            for(int i =0;i<k-1;i++){
//                if(it!=null)
//                    it=it.next;
//                else
//                    break;
//            }
//            if(it==null)
//                return head;
//            else{
//                forward.val = it.val;
//                it.val = swap;
//                it = it.next;
//            }
//        }
//        return head;
    }
    public static void main(String args[]){
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i+1);
            it.next = a;
            it = a;
        }
        ListNode b= new Leet_25().reverseKGroup(count,3);
        System.out.println();
    }
}
