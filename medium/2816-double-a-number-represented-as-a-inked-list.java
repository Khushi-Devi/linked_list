// ============================================
// Problem : #2816 Double a Number Represented as a Linked List
// Difficulty : Medium
// Topic    : Linked List
// Link     : https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
// ============================================

// --- Approach: Reverse + Carry Propagation ---
// Time: O(n) | Space: O(1)
// Step 1: Reverse the list to process from least significant digit.
// Step 2: Traverse nodes, double each digit + carry.
// Step 3: Update node values, propagate carry.
// Step 4: If carry remains, append new node.
// Step 5: Reverse list back to restore original order.
class Solution {
    private ListNode rev(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode doubleIt(ListNode head) {
        head = rev(head);
        int carry = 0;
        ListNode curr = head;
        ListNode last = null;

        while (curr != null) {
            int val = curr.val * 2 + carry;
            curr.val = val % 10;
            carry = val / 10;
            last = curr;
            curr = curr.next;
        }

        if (carry > 0) {
            last.next = new ListNode(carry);
        }

        head = rev(head);
        return head;
    }
}
