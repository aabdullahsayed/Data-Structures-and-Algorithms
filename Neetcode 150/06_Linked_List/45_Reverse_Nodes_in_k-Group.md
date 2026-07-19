# 45. Reverse Nodes in k-Group

**Difficulty:** Hard

**Pattern:** Iterative group-wise reversal using the Reverse Linked List technique

## Key Idea
Check if at least k nodes remain; if so, reverse exactly that group using standard pointer reversal, then recursively/iteratively continue with the remainder, splicing groups back together.

## Approach
1. First, walk ahead k nodes from the current position to check there are enough nodes left to form a full group; if not, leave the remainder as-is.
2. If a full group exists, reverse those k nodes in place (standard prev/curr/next reversal technique) with a bounded count instead of going to the end of the list.
3. The original head of this group becomes the tail after reversal — connect it to the result of recursively processing the rest of the list.
4. Connect the previous group's tail to the new group's head (which was the group's original last node before reversal).

## Complexity
Time: O(n) | Space: O(1) iterative, O(n/k) recursive call stack if done recursively

## Edge Cases
k = 1 (no-op, list unchanged), k equal to full list length, remaining nodes fewer than k (left un-reversed per problem statement).

## Related / Notes
The capstone linked-list problem — combines counting, bounded reversal, and careful re-linking of previous/next group boundaries.
