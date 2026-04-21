// ============================================
// Problem : #445 Add Two Numbers II
// Difficulty : Medium
// Topic    : Stack, Linked List
// Link     : https://leetcode.com/problems/add-two-numbers-ii/
// ============================================

// --- Approach: Stacks + Linked List ---
// Time: O(m + n) | Space: O(m + n)
// Push digits of both lists into stacks to reverse order.
// Pop from stacks to add digits from least significant to most.
// Build result list by prepending new nodes.
// Carry is handled at each step.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = null;
        int carry = 0;
        
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
            carry = sum / 10;
        }
        return head;
    }
}


