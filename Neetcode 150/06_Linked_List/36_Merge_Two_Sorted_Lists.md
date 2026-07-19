# 36. Merge Two Sorted Lists

**Difficulty:** Easy

**Pattern:** Two-pointer merge with a dummy head node

## Key Idea
Walk both lists simultaneously, always attaching the smaller current node to the result, exactly like the merge step of merge sort.

## Approach
1. Create dummy = ListNode(), tail = dummy.
2. While both l1 and l2 are non-null: if l1.val <= l2.val, tail.next = l1, l1 = l1.next; else tail.next = l2, l2 = l2.next. Then tail = tail.next.
3. After the loop, attach whichever list still has remaining nodes: tail.next = l1 or l2 (only one is non-null).
4. Return dummy.next as the merged list's head.

## Complexity
Time: O(n + m) | Space: O(1) extra (reuses existing nodes)

## Edge Cases
One or both lists empty.

## Related / Notes
Core subroutine reused inside Merge k Sorted Lists.
