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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;

            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
            carry = sum == 0 ? 0 : sum / 10;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            curr.next = node;
        }

        return result.next;
    }
}