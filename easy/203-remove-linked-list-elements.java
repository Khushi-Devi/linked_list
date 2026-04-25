// ============================================
// Problem : #203 Remove Linked List Elements
// Difficulty : Easy
// Topic    : Linked List
// Link     : https://leetcode.com/problems/remove-linked-list-elements/
// ============================================

// --- Approach: Dummy Node + Iterative Removal ---
// Time: O(n) | Space: O(1)
// Use a dummy node to handle edge cases (like removing head).
// Traverse with a pointer, check next node’s value.
// If it matches target, bypass it. Otherwise, move forward.
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ptr = dummy;

        while (ptr.next != null) {
            if (ptr.next.val == val) {
                ptr.next = ptr.next.next; 
            } else {
                ptr = ptr.next;
            }
        }
        return dummy.next;
    }
}
