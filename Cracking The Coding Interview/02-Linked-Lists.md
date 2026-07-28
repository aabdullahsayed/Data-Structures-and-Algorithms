# Chapter 2: Linked Lists

## Easy Explanation
Imagine a treasure hunt where each clue tells you where the next clue is. A **linked list** is like that: each "node" holds a value and a pointer (arrow) to the next node. Unlike arrays, the nodes aren't next to each other in memory — you can only get to node 5 by walking through nodes 1, 2, 3, 4 first.

## Why It Matters
Linked lists teach pointer manipulation, which shows up in trees, graphs, and low-level systems. A huge chunk of CTCI linked-list questions are solved with the **two-pointer (runner) technique**.

## Common Patterns
- **Runner/Fast-Slow Pointers**: One pointer moves 1 step, another moves 2 steps. Great for finding the middle, detecting cycles, or finding "kth from the end."
- **Dummy Head Node**: Create a fake node before the real head so you never have to special-case "what if I delete the head?"
- **Recursion**: Many linked list problems (reverse, merge) have elegant recursive solutions.

## Key Complexity
| Operation | Singly Linked List |
|---|---|
| Access by index | O(n) |
| Insert/Delete at head | O(1) |
| Insert/Delete at tail (no tail pointer) | O(n) |
| Search | O(n) |

## Classic Problems

### 1. Remove Dups — Remove duplicates from an unsorted linked list
**Easy idea:** Use a hash set to remember values you've seen; skip nodes whose value is already seen.

### 2. Return Kth to Last
**Easy idea:** Runner technique — move one pointer k steps ahead, then move both pointers together until the front one hits the end. The back pointer is now at the kth-to-last node.

### 3. Delete Middle Node (given only that node, not the head)
**Easy idea:** You can't "delete" it directly, so instead **copy the next node's data into this node**, then skip over the next node.

### 4. Partition — Split a list around a value x (smaller before, larger after)
**Easy idea:** Build two lists (before and after) as you walk through, then join them.

### 5. Sum Lists — Add two numbers represented as linked lists (digits in reverse order)
**Easy idea:** Just like adding numbers by hand — walk both lists together, add digit by digit, carry the overflow.

### 6. Palindrome — Check if a linked list is a palindrome
**Easy idea:** Use the fast/slow runner to find the middle, reverse the second half, then compare both halves.

### 7. Intersection — Find where two lists merge into one
**Easy idea:** Get both lengths, advance the longer list's pointer by the difference, then move both together until they match.

### 8. Loop Detection — Does a list have a cycle, and where does it start?
**Easy idea (Floyd's Cycle Detection):** Fast pointer moves 2 steps, slow moves 1. If they meet, there's a cycle. To find the start, reset one pointer to the head and move both one step at a time — they'll meet at the cycle's start.

## Practice Tip
Always ask: "What if the list is empty? What if it has only one node?" These edge cases trip people up constantly.
