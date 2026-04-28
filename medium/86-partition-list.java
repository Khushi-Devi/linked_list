// ============================================
// Problem : #86 Partition List
// Difficulty : Medium
// Topic    : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/partition-list/
// ============================================

// --- Approach: Two Dummy Lists ---
// Time: O(n) | Space: O(1)
// 1. Create two dummy nodes: leftDummy for nodes < x, rightDummy for nodes >= x.
// 2. Traverse the list, attach each node to the correct list.
// 3. Connect left list to right list.
// 4. Return leftDummy.next as the new head.
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);

        ListNode left = leftDummy;
        ListNode right = rightDummy;

        // Step 1: Traverse and partition nodes
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }

        // Step 2: Connect lists
        right.next = null;
        left.next = rightDummy.next;

        // Step 3: Return new head
        return leftDummy.next;
    }
}
