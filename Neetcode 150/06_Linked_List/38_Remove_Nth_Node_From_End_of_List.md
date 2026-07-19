# 38. Remove Nth Node From End of List

**Difficulty:** Medium

**Pattern:** Two Pointers with an n-node gap

## Key Idea
Advance a 'fast' pointer n steps ahead first; then move both fast and slow together — when fast reaches the end, slow is right before the node to remove.

## Approach
1. Create dummy node pointing to head (handles removing the head cleanly); set left = dummy, right = dummy.
2. Move right forward n+1 times (creates an n-node gap between left and right, and right ends one node past what left needs to stop before).
3. Move left and right together one step at a time until right is None.
4. left.next now points to the node to remove — set left.next = left.next.next.
5. Return dummy.next.

## Complexity
Time: O(n) — single pass | Space: O(1)

## Edge Cases
Removing the head node itself (n == length of list) — the dummy node handles this without special-casing.

## Related / Notes
Classic two-pointer 'n-gap' trick also useful for other 'kth from end' style problems.
