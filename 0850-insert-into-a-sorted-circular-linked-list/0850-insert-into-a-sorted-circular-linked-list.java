/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }

        Node slow = head;

        while (slow != null) {
            Node fast = slow.next;

            if (fast.val >= insertVal && slow.val <= insertVal) {
                break;
            }

            if (slow.val > fast.val) {
                if (fast.val >= insertVal || slow.val <= insertVal) {
                    break;
                }
            }

            slow = slow.next;

            if (slow == head) {
                break;
            }
        }
        Node node = new Node(insertVal, slow.next);
        slow.next = node;
        return head;

    }
}