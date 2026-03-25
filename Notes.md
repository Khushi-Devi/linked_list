Linked List — Notes

206 · Reverse Linked List
Difficulty: Easy | Tags: pointer-reversal three-pointer
A linked list only knows how to go forward. Reversing it means teaching every node to point backwards instead. The key insight is that you can't flip pointers one by one without losing your place — that's why you keep a prev pointer alongside curr, so you always know where you just came from as you rewire the chain.

83 · Remove Duplicates from Sorted List
Difficulty: Easy | Tags: skip-node single-pointer
In a linked list you don't delete a node — you just stop pointing to it. Setting curr.next = curr.next.next reaches past the unwanted node and it's effectively gone. This works cleanly here because the list is sorted, so duplicates always sit adjacent. On an unsorted list you'd need extra memory to track what you've already seen.