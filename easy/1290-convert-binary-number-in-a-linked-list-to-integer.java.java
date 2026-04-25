// ============================================
// Problem : #1290 Convert Binary Number in a Linked List to Integer
// Difficulty : Easy
// Topic    : Linked List, Binary, Math
// Link     : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
// ============================================

// --- Approach: Traverse & Build Integer ---
// Time: O(n) | Space: O(1)
// Traverse the linked list from head to end.
// At each step, multiply current number by 2 (left shift)
// and add the current node’s value (0 or 1).
// Continue until the list ends, then return the result.
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode ptr = head;
        while (ptr != null) {
            num = num * 2 + ptr.val;
            ptr = ptr.next;
        }
        return num;
    }
}
