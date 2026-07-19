# 42. Find the Duplicate Number

**Difficulty:** Medium

**Pattern:** Floyd's Cycle Detection applied to an implicit linked list (value-as-next-index)

## Key Idea
Treat each array value as a 'pointer' to the next index (nums[i] tells you where to go next); since a duplicate exists, following these pointers must eventually cycle, and finding the cycle's entrance gives the duplicate.

## Approach
1. Phase 1 (find intersection): slow = nums[0], fast = nums[0]; repeat slow = nums[slow], fast = nums[nums[fast]] until slow == fast.
2. Phase 2 (find cycle entrance = duplicate): reset slow2 = nums[0] (a fresh pointer starting from the beginning); move slow and slow2 one step at a time (slow = nums[slow], slow2 = nums[slow2]) until they meet.
3. The meeting point is the duplicate number.
4. This works without modifying the array and without extra space, unlike a hash-set approach.

## Complexity
Time: O(n) | Space: O(1)

## Edge Cases
Duplicate appears more than twice, duplicate is a small or large value.

## Related / Notes
A clever reuse of Linked List Cycle's exact algorithm on an array instead of an explicit list — recognize the disguise.
