# 018. Partition Array

**Topic:** Two Pointers
**Difficulty:** Medium
**Solution file:** [`018-Partition-Array.java`](./018-Partition-Array.java)

## Problem

Given an array and a pivot value, rearrange the elements in-place so that all elements less than the pivot come before all elements greater than or equal to it (the partition step of quicksort).

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  arr = [9, 12, 5, 10, 14, 3, 10], pivot = 10
Output: [9, 5, 3, 12, 10, 14, 10]
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

See [`018-Partition-Array.java`](./018-Partition-Array.java) in this folder — implement the `TODO` inside `PartitionArray.partitionArray(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
