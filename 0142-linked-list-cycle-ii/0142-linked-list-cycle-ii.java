/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       HashSet<ListNode> list = new HashSet<>();
        ListNode node = head;

        while (node != null){
            
            if(list.contains(node)){
                return node;
            }

            list.add(node);
            node = node.next;
        }

        return null;
    }
}