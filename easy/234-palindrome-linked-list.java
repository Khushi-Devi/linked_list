// ============================================
// Problem : Palindrome Linked List
// Difficulty : Easy
// Topic    : Linked List, Two Pointers, ArrayList
// Link     : https://leetcode.com/problems/palindrome-linked-list/
// ============================================

// --- Approach: ArrayList + Two-Pointer Check ---
// Time: O(n) | Space: O(n)
// Traverse the linked list and store values in an ArrayList.
// Use two pointers (i, j) to compare elements from both ends.
// If mismatch found, return false. Otherwise, return true.
class Solution {
    boolean isPalindrome(Node head) {
        ArrayList<Integer> al = new ArrayList<>();
        Node ptr = head;
        while (ptr != null) {
            al.add(ptr.data);
            ptr = ptr.next;
        }
        int i = 0;
        int j = al.size() - 1;
        while (i < j) {
            if (al.get(i) != al.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
