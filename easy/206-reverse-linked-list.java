// ============================================
// Problem : #206 Reverse Linked List
// Difficulty : Easy
// Topic    : Linked List
// Approach : Iterative — O(n) time, O(1) space
// Link     : https://leetcode.com/problems/reverse-linked-list/
// ============================================

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ptr1=null;
        ListNode ptr2=head;
        while(ptr2!=null){
            ListNode temp=ptr2.next;
            ptr2.next=ptr1;
            ptr1=ptr2;
            ptr2=temp;
        }
        return ptr1;
    }
}