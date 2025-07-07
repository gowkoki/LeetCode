/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;

        ListNode curr = head;
        int count = 1;

        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        int position = k % count;
        if (position == 0)
            return head;

        ListNode current = head;
        for (int i = 0; i < count - position - 1; i++) {
            current = current.next;
        }

        ListNode newHead = current.next;
        current.next = null;
        curr.next = head;

        return newHead;

    }
}