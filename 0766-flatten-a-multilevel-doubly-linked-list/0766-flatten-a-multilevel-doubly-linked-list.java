/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {

    public Node flatten(Node head) {
        if (head == null)
            return head;
        Node current = head;

        while (current != null) {
            if (current.child != null) {
                Node next = current.next;
                Node childHead = flatten(current.child);

                current.next = childHead;
                childHead.prev = current;
                current.child = null;

                Node tail = childHead;
                while (tail.next != null) {
                    tail = tail.next;
                }

                if (next != null) {
                    tail.next = next;
                    next.prev = tail;
                }
            }
            current = current.next;

        }

        return head;
    }
}