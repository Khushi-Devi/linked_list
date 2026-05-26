// ============================================
// Problem : #82 Remove Duplicates from Sorted List II
// Difficulty : Medium
// Topic    : Linked List
// Link     : https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// ============================================

// --- Approach: Dummy Node + Skip Duplicates ---
// Time: O(n) | Space: O(1)
// 1. Use a dummy node to handle edge cases (like duplicates at the head).
// 2. Traverse with two pointers: ptr (previous) and ptr1 (current).
// 3. If ptr1 has duplicates, skip all nodes with that value.
// 4. Otherwise, move forward normally.
// 5. Return dummy.next as the new head.
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ptr = dummy;
        ListNode ptr1 = head;

        while (ptr1 != null && ptr1.next != null) {
            if (ptr1.val == ptr1.next.val) {
                // Skip all nodes with the same value
                while (ptr1.next != null && ptr1.val == ptr1.next.val) {
                    ptr1 = ptr1.next;
                }
                ptr.next = ptr1.next;
            } else {
                ptr = ptr.next;
            }
            ptr1 = ptr1.next;
        }
        return dummy.next;
    }
}
