# Linked List — Notes

# 206(Reverse Linked List)
A linked list only knows how to go forward. Reversing it means teaching every node to point backwards instead. The key insight is that you can't flip pointers one by one without losing your place — that's why you keep a prev pointer alongside curr, so you always know where you just came from as you rewire the chain.

# 83(Remove Duplicates from Sorted List)
In a linked list you don't delete a node — you just stop pointing to it. Setting curr.next = curr.next.next reaches past the unwanted node and it's effectively gone. This works cleanly here because the list is sorted, so duplicates always sit adjacent. On an unsorted list you'd need extra memory to track what you've already seen.

# 445(Add Teo Numbers II)
This problem extends the classic “Add Two Numbers” but digits are stored in forward order. To handle this, you use stacks to reverse the order of digits. By pushing all digits into stacks, you can pop them to process from least significant to most significant.

At each step, you add the digits plus carry, create a new node, and prepend it to the result list. This ensures the final linked list is in the correct forward order. The approach runs in linear time and space relative to the input size, and neatly demonstrates how stacks can be used to reverse traversal order in linked list problems.

# 237(Delete Node in a Linked List) 
This problem is unusual because you’re not given the head of the list, only the node to delete. The trick is to overwrite the current node’s value with the next node’s value, then bypass the next node by adjusting the pointer.

This works because the node to delete is guaranteed not to be the tail. The solution runs in constant time and space, and is a classic interview test of understanding how linked list nodes can be manipulated directly.