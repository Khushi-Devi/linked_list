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

# 141(Linkedlist Cycle)

This problem asks whether a linked list contains a cycle. The elegant solution is Floyd’s Cycle Detection algorithm (also called Tortoise & Hare).

Slow pointer moves one step at a time.

Fast pointer moves two steps at a time.

If there’s a cycle, they will eventually meet inside the loop.

If there’s no cycle, the fast pointer will reach null safely.

This runs in linear time and constant space, making it one of the most efficient cycle detection techniques.

# 160 (Intersection of Two Linked Lists) 

This problem asks you to find the node where two singly linked lists intersect. The elegant trick is to traverse both lists with two pointers.

Start ptr1 at headA and ptr2 at headB.

When a pointer reaches the end of its list, redirect it to the other list’s head.

Both pointers traverse exactly lenA + lenB.

If there’s an intersection, they will meet at that node.

If not, both will reach null at the same time.

This solution runs in linear time and constant space, and is considered the interview‑safe O(n) / O(1) approach.

# 203 (Remove Linked List Elements) 

This problem asks you to remove all nodes with a given value. The clean trick is to use a dummy node pointing to the head, so you don’t need special handling when the head itself must be removed.

Traverse with a pointer (ptr).

If ptr.next.val == target, bypass that node.

Otherwise, move forward.

Continue until the end.

This runs in linear time and constant space. Using a dummy node makes the code concise and avoids edge‑case bugs.

# 876 (Middle of the Linked List)
This problem asks you to return the middle node of a linked list. The elegant solution uses two pointers:

Slow pointer moves one step at a time.

Fast pointer moves two steps at a time.

When fast reaches the end, slow will be at the middle.

If the list has an even number of nodes, this method returns the second middle node, which matches the problem’s requirement.

This runs in linear time and constant space, making it one of the most efficient and interview‑friendly techniques.

# 1290 ( Convert Binary Number in a Linked List to Integer)

This problem asks you to convert a binary number stored in a linked list into its decimal value. The trick is to traverse the list and build the integer step by step:

Start with num = 0.

For each node, multiply num by 2 (left shift) and add the current digit.

Continue until the end of the list.

This runs in O(n) time and O(1) space. It’s a neat example of how linked list traversal can simulate binary number conversion.

# 234 (Palindrome Linked List ) 

This problem asks you to check if a linked list is a palindrome.

ArrayList approach (O(n) space): Copy all values into an array, then compare from both ends inward.

Optimal approach (O(1) space): Use fast/slow pointers to find the middle, reverse the second half, and compare node by node.

The ArrayList method is simple and intuitive, while the reverse‑second‑half method is more efficient and interview‑friendly.

# 61 (Rotate List)

This problem asks you to rotate a linked list to the right by k places.

First compute the length of the list.

Normalize k using k % length (rotating by length returns the same list).

Find the new tail at position (length - k - 1).

Break the list at that point, set the next node as the new head, and connect the old tail to the old head.

# 86 (Partition List)

This problem asks you to reorder a linked list so that all nodes with values less than x come before nodes with values greater than or equal to x.

Use two dummy nodes to build two separate lists.

Traverse the original list, attaching each node to the correct list.

Connect the two lists at the end.

Return the head of the left list.

# 82 (Remove Duplicates from Sorted List II)  

This problem asks you to remove all nodes that have duplicate numbers, leaving only distinct values.

Use a dummy node to simplify edge cases.

Traverse the list with two pointers.

If duplicates are detected, skip all nodes with that value.

Otherwise, move forward.

Return the new head from dummy.next.

This runs in O(n) time and O(1) space. It’s a classic linked list problem that tests careful pointer manipulation and handling of duplicate sequences.
