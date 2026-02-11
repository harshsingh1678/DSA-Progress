/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // My Approach copy the value of given node's next into node
        node.val = node.next.val;
        // now node should be point to the its next next node so that we can skip given node's next element
        node.next = node.next.next;
    }
}