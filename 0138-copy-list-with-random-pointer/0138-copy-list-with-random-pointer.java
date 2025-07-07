/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node current = head;

        while (current != null) {
            Node newNode = new Node(current.val);
            map.put(current, newNode);
            current = current.next;
        }

        current = head;

        while (current != null) {
            Node copiedNode = map.get(current);
            copiedNode.next = map.get(current.next);
            copiedNode.random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);
    }
}