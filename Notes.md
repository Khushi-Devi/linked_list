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

# 2(Add Two Numbers)

This problem asks you to add two numbers represented as linked lists, where digits are stored in reverse order. The trick is to simulate addition digit by digit, just like on paper.

You use a dummy node to simplify list construction. At each step, add the digits from both lists plus any carry. Create a new node with the result’s last digit, and update the carry. Continue until both lists are exhausted and no carry remains.

This approach runs in linear time relative to the length of the lists and uses only O(1) extra space beyond the output list. It’s a fundamental linked list problem that tests understanding of pointer manipulation and arithmetic logic.

# 2816(Double a Number Represented as a Linked List)

The problem asks you to double the integer represented by a linked list of digits. Since digits are stored in forward order, you can’t process from least significant digit directly.

The trick is to reverse the list first. Then, traverse from least significant digit, double each value, and handle carry propagation. If a carry remains after the last node, append a new node. Finally, reverse the list back to restore the original order.

This approach runs in linear time and constant extra space, and is interview‑friendly because it avoids auxiliary structures like arrays or stacks.

# 21 (Merge Two Sorted Lists) 

This problem asks you to merge two sorted linked lists into one sorted list. The clean way is to use a dummy node and a pointer (ptr) to build the result. At each step, compare the current nodes of both lists, attach the smaller one, and advance. When one list is exhausted, attach the remainder of the other.

This version creates new nodes for the merged list, so space complexity is O(m+n). An optimized variant reuses the existing nodes, which reduces space to O(1). Both are valid, but the in‑place reuse is more efficient and interview‑friendly.