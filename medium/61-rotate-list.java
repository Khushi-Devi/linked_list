// ============================================
// Problem : #61 Rotate List
// Difficulty : Medium
// Topic    : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/rotate-list/
// ============================================

// --- Approach: Length Calculation + Modulo + Re-link ---
// Time: O(n) | Space: O(1)
// 1. Compute the length of the list.
// 2. Normalize k using k % length (rotating by length gives same list).
// 3. Find the new tail at position (length - k - 1).
// 4. Break the list at new tail, set new head, and connect old tail to old head.
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0) return head;
        int stepsToNewTail = length - k - 1;
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
    }
}
