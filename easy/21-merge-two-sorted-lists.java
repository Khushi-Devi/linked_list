// ============================================
// Problem : #21 Merge Two Sorted Lists
// Difficulty : Easy
// Topic    : Linked List
// Link     : https://leetcode.com/problems/merge-two-sorted-lists/
// ============================================

// --- Approach: Dummy Node + Iterative Merge ---
// Time: O(m + n) | Space: O(m + n) (new nodes created)
// Use a dummy node to simplify head handling.
// Compare current nodes of both lists.
// Attach smaller value as a new node, advance pointer.
// Continue until one list is exhausted, then attach remainder.
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val <= ptr2.val) {
                ptr.next = new ListNode(ptr1.val);
                ptr = ptr.next;
                ptr1 = ptr1.next;
            } else {
                ptr.next = new ListNode(ptr2.val);
                ptr = ptr.next;
                ptr2 = ptr2.next;
            }
        }

        while (ptr1 != null) {
            ptr.next = new ListNode(ptr1.val);
            ptr = ptr.next;
            ptr1 = ptr1.next;
        }

        while (ptr2 != null) {
            ptr.next = new ListNode(ptr2.val);
            ptr = ptr.next;
            ptr2 = ptr2.next;
        }

        return dummy.next;
    }
}

