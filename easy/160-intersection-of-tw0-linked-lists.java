// ============================================
// Problem : #160 Intersection of Two Linked Lists
// Difficulty : Easy
// Topic    : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/intersection-of-two-linked-lists/
// ============================================

// --- Approach: Two Pointers with Head Switching ---
// Time: O(m + n) | Space: O(1)
// Traverse both lists with two pointers.
// When a pointer reaches the end, redirect it to the other list’s head.
// Eventually, they will either meet at the intersection node or both reach null.
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        while (ptr1 != ptr2) {
            ptr1 = (ptr1 == null) ? headB : ptr1.next;
            ptr2 = (ptr2 == null) ? headA : ptr2.next;
        }
        return ptr1;
    }
}
