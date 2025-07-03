class Solution {
    public Node flatten(Node head) {
        if (head == null)
            return null;
        Node temp = head;
        Node curr = head;
        while (temp != null) {
            if (curr.child == null) {
                temp = temp.next;
                curr = temp;
            } else {
                Node child = curr.child;
                Node next = curr.next;
                curr.next = child;
                child.prev = curr;
                curr.child = null;
                Node childTail = child;
                while (childTail.next != null) {
                    childTail = childTail.next;
                }
                childTail.next = next;
                if (next != null) {
                    next.prev = childTail;
                }
                temp = curr.next;
                curr = temp;
            }
        }
        return head;
    }
}