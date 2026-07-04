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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode current = head;
        
        // Traverse the list until the end
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Duplicate found, skip the next node
                current.next = current.next.next;
            } else {
                // No duplicate, advance the pointer
                current = current.next;
            }
        }
        
        return head;
    }
}