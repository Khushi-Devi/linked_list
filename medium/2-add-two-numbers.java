// ============================================
// Problem : #2 Add Two Numbers
// Difficulty : Medium
// Topic    : Linked List
// Link     : https://leetcode.com/problems/add-two-numbers/
// ============================================

// --- Approach: Iterative Linked List ---
// Time: O(m + n) | Space: O(max(m, n))
// Use a dummy node to simplify construction.
// Traverse both lists simultaneously, adding digits + carry.
// Create new nodes for each digit of the sum.
// Continue until both lists and carry are exhausted.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode ptr = temp;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int carry = 0;

        while (ptr1 != null || ptr2 != null || carry != 0) {
            int sum = carry;
            if (ptr1 != null) {
                sum += ptr1.val;
                ptr1 = ptr1.next;
            }
            if (ptr2 != null) {
                sum += ptr2.val;
                ptr2 = ptr2.next;
            }
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
            carry = sum / 10;
        }
        return temp.next;
    }
}
