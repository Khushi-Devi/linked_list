// ============================================
// Problem : #141 Linked List Cycle
// Difficulty : Easy
// Topic    : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/linked-list-cycle/
// ============================================

// --- Approach: Floyd’s Cycle Detection (Tortoise & Hare) ---
// Time: O(n) | Space: O(1)
// Use two pointers: slow (1 step), fast (2 steps).
// If they ever meet, a cycle exists.
// If fast reaches null, no cycle.
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps
            if (slow == fast) return true;
        }
        return false;
    }
}

