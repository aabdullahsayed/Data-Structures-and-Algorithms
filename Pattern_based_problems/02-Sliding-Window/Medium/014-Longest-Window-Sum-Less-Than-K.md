# 014. Longest Window Sum Less Than K

**Topic:** Sliding Window
**Difficulty:** Medium
**Solution file:** [`014-Longest-Window-Sum-Less-Than-K.java`](./014-Longest-Window-Sum-Less-Than-K.java)

## Problem

Given an array of positive integers and a value K, find the length of the longest contiguous subarray whose sum is less than or equal to K.

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  arr = [1,2,1,0,1,1,0], K = 4
Output: 5
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Sliding Window** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`014-Longest-Window-Sum-Less-Than-K.java`](./014-Longest-Window-Sum-Less-Than-K.java) in this folder — implement the `TODO` inside `LongestWindowSumLessThanK.longestWindowSumLessThanK(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
