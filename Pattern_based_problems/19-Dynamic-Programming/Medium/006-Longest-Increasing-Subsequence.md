# 006. Longest Increasing Subsequence

**Topic:** Dynamic Programming
**Difficulty:** Medium
**Solution file:** [`006-Longest-Increasing-Subsequence.java`](./006-Longest-Increasing-Subsequence.java)

## Problem

Given an array, find the length of its longest strictly increasing subsequence.

## Technique Reminder

Break problems into overlapping subproblems and cache results to avoid recomputation.

**Hint:** Define state clearly, find the recurrence relation, then decide top-down (memo) or bottom-up (tabulation).

## Example

```
Input:  arr = [10,9,2,5,3,7,101,18]
Output: 4
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Dynamic Programming** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`006-Longest-Increasing-Subsequence.java`](./006-Longest-Increasing-Subsequence.java) in this folder — implement the `TODO` inside `LongestIncreasingSubsequence.longestIncreasingSubsequence(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
