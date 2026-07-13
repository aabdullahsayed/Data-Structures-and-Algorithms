# 021. Merge Intervals Two Pointer

**Topic:** Two Pointers
**Difficulty:** Medium
**Solution file:** [`021-Merge-Intervals-Two-Pointer.java`](./021-Merge-Intervals-Two-Pointer.java)

## Problem

Given two lists of sorted, mutually non-overlapping intervals, merge them into a single sorted, non-overlapping list of intervals using two pointers.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  a = [[1,3],[5,6],[7,9]], b = [[2,4]]
Output: [[1,4],[5,6],[7,9]]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Two Pointers** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`021-Merge-Intervals-Two-Pointer.java`](./021-Merge-Intervals-Two-Pointer.java) in this folder — implement the `TODO` inside `MergeIntervalsTwoPointer.mergeIntervalsTwoPointer(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
