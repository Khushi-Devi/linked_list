// ============================================
// Problem : 83. Remove Duplicates from Sorted List
// Difficulty : Easy
// Topic    : Linked List
// Approach : Iterative — O(n) time, O(1) space
// Link     : https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
// ============================================


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr1=head;
        while(ptr1!=null && ptr1.next!=null){
            if(ptr1.val==ptr1.next.val){
                ptr1.next=ptr1.next.next;
            }
            else ptr1=ptr1.next;
        }
        return head;
    }
}