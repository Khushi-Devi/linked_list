// ============================================
// Problem : #92 Reverse Linked List II
// Difficulty : Medium
// Topic    : Linked List, In-place Reversal
// Link     : https://leetcode.com/problems/reverse-linked-list-ii/
// ============================================

// --- Approach: Dummy Node + Sublist Reversal ---
// Time: O(n) | Space: O(1)
// 1. Use a dummy node to simplify edge cases (like reversing from head).
// 2. Traverse to node before 'left' (prev).
// 3. Reverse the sublist between left and right using standard reversal.
// 4. Reconnect prev to new head of sublist, and tail of sublist to remaining list.

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevSub = null;

        for (int i = 0; i <= right - left; i++) {
            next = curr.next;
            curr.next = prevSub;
            prevSub = curr;
            curr = next;
        }
        prev.next.next = curr;
        prev.next = prevSub;
        return dummy.next;
    }
}
