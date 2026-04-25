// ============================================
// Problem : #876 Middle of the Linked List
// Difficulty : Easy
// Topic    : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/middle-of-the-linked-list/
// ============================================

// --- Approach: Fast & Slow Pointers ---
// Time: O(n) | Space: O(1)
// Use two pointers: slow (1 step), fast (2 steps).
// When fast reaches the end, slow will be at the middle.
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; 
            slow = slow.next;
        }
        return slow;
    }
}

