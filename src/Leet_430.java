/**
 * Created by tracysaber on 2018-7-25.
 * You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.

 Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

 Example:

 Input:
 1---2---3---4---5---6--NULL
 |
 7---8---9---10--NULL
 |
 11--12--NULL

 Output:
 1-2-3-7-8-11-12-9-10-4-5-6-NULL
 */
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
public class Leet_430 {
    public Node flat(Node h){
        h.next = h.child;
        h.child = null;
        Node it = h.child;
        while(it.next!=null){
            if(it.child!=null){
                Node tail = it.next;
                flat(it).next = tail;
                it = tail;
            }
            else{
                it = it.next;
            }
        }
        return it;
    }
    public Node flatten(Node head) {
        Node it = head;
        while(it!=null){
            if(it.child!=null){
                Node tail = it.next;
                flat(it).next = tail;
                it = tail;
            }
            else{
                it = it.next;
            }
        }
        return  head;
    }
    public static void main(String args[]){
        Node head = new Node(1,null,null,null);
        head.next = new Node(2,null,null,null);
        head.next.next = new Node(3,null,null,null);
        head.next.next.next = new Node(6,null,null,null);
        head.next.next.child = new Node(4,null,null,null);
        Node it = head.next.next.child;
        it.next = new Node(5,null,null,null);
        new Leet_430().flatten(head);
        System.out.println();
    }
}
