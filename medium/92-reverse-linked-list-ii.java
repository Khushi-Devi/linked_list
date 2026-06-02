// ============================================
// Problem : #92 Reverse Linked List II
// Difficulty : Medium
// Topic    : Linked List, In-place Reversal
// Link     : https://leetcode.com/problems/reverse-linked-list-ii/
// ============================================

// --- Approach: Dummy Node + Sublist Reversal ---
// Time: O(n) | Space: O(1)
// 1. Use a dummy node to simplify edge cases.
// 2. Traverse to node before 'left' (fj).
// 3. Reverse the sublist between left and right.
// 4. Reconnect fj to new head of sublist, and lj (original left node) to remainder.
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Step 1: Dummy node setup
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = null;
        ListNode curr = dummy;

        // Step 2: Move to node before 'left'
        for (int i = 0; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }

        // fj = node before sublist, lj = first node of sublist
        ListNode fj = prev;
        ListNode lj = curr;

        // Step 3: Reverse sublist
        prev = null;
        for (int i = 1; i <= right - left + 1; i++) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Step 4: Reconnect
        lj.next = curr;   // tail of reversed sublist points to remainder
        fj.next = prev;   // node before sublist points to new head

        return dummy.next;
    }
}
