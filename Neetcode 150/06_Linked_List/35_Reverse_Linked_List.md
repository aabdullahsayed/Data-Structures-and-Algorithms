# 35. Reverse Linked List

**Difficulty:** Easy

**Pattern:** Iterative pointer reversal (or recursive)

## Key Idea
Walk the list once, reversing each node's 'next' pointer to point backward instead of forward.

## Approach
1. Set prev = None, curr = head.
2. While curr: next_node = curr.next (save it before overwriting); curr.next = prev (reverse the link); prev = curr; curr = next_node.
3. Return prev — it ends up as the new head.
4. Recursive alt: reverse(head.next) then head.next.next = head; head.next = None.

## Complexity
Time: O(n) | Space: O(1) iterative, O(n) recursive (call stack)

## Edge Cases
Empty list, single-node list.

## Related / Notes
Building block for Reorder List, Reverse Nodes in k-Group, palindrome linked list checks.
