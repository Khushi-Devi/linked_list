// ============================================
// Problem : #328 Odd Even Linked List
// Difficulty : Medium
// Topic    : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/odd-even-linked-list/
// ============================================

// --- Approach: Separate Odd & Even Chains ---
// Time: O(n) | Space: O(1)
// 1. Maintain two pointers: ptr1 for odd nodes, ptr2 for even nodes.
// 2. Rewire next pointers so odd nodes form one chain and even nodes another.
// 3. At the end, connect the odd chain to the even chain.
// 4. Return head as the new reordered list.
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode ptr1 = head;        // odd pointer
        ListNode ptr2 = head.next;   // even pointer
        ListNode ptr = ptr2;         // head of even list
        while (ptr2 != null && ptr2.next != null) {
            ptr1.next = ptr2.next;   // link odd to next odd
            ptr1 = ptr1.next;        // move odd pointer
            ptr2.next = ptr1.next;   // link even to next even
            ptr2 = ptr2.next;        // move even pointer
        }
        ptr1.next = ptr;
        return head;
    }
}
