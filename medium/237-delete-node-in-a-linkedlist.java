// ============================================
// Problem : #237 Delete Node in a Linked List
// Difficulty : Easy
// Topic    : Linked List
// Link     : https://leetcode.com/problems/delete-node-in-a-linked-list/
// ============================================

// --- Approach: Value Copy + Pointer Skip ---
// Time: O(1) | Space: O(1)
// You are given only the node to delete, not the head.
// Copy the value of the next node into the current node.
// Redirect current node’s next pointer to skip the next node.
// This effectively deletes the given node.
class Solution{
    public void deleteNode(ListNode node) {
        node.val = node.next.val;   
        node.next = node.next.next;
    }
}



// ============================================
// Problem : #237 Delete Node in a Linked List
// Difficulty : Easy
// Topic    : Linked List
// Link     : https://leetcode.com/problems/delete-node-in-a-linked-list/
// ============================================

// --- Approach: Shift Values Forward ---
// Time: O(k) | Space: O(1)
// Instead of copying only the next node’s value,
// repeatedly copy values forward until reaching the tail.
// Finally, set the last node’s next = null.
// This simulates deletion of the given node.
class Solution {
    public void deleteNode(ListNode node) {
        ListNode ptr1 = node;
        ListNode ptr2 = ptr1.next;
        while (ptr2.next != null) {
            ptr1.val = ptr2.val;
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        ptr1.val = ptr2.val;
        ptr1.next = null;
    }
}

