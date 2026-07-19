# 37. Reorder List

**Difficulty:** Medium

**Pattern:** Find middle (fast/slow) + Reverse second half + Merge alternately

## Key Idea
Split the list into two halves, reverse the second half, then weave the two halves together node by node.

## Approach
1. Find the middle using slow/fast pointers (slow moves 1 step, fast moves 2; when fast hits the end, slow is at/near the middle).
2. Split the list at slow; reverse the second half using the standard reversal technique.
3. Merge the two halves by alternating: take one node from first half, then one from second half, repeat, relinking 'next' pointers.
4. Set the final node's next to None to properly terminate the list.

## Complexity
Time: O(n) | Space: O(1)

## Edge Cases
Odd vs even length lists change where the split happens — handle both, single or two-node lists.

## Related / Notes
Combines three earlier patterns (Reverse Linked List, Linked List Cycle's fast/slow, Merge Two Sorted Lists) into one problem.
