# 004. Constrained Subsequence Sum

**Topic:** Monotonic Queue
**Difficulty:** Medium
**Solution file:** [`004-Constrained-Subsequence-Sum.java`](./004-Constrained-Subsequence-Sum.java)

## Problem

Given an array and integer k, find the maximum sum of a non-empty subsequence such that for every two consecutive chosen elements, their indices in the array differ by at most k. Solve using DP plus a monotonic deque to track the best recent value.

## Technique Reminder

A deque that stays monotonic, used for sliding-window max/min in O(n).

**Hint:** Push from the back, popping smaller/larger elements first; pop from the front when out of window.

## Example

```
Input:  arr = [10,2,-10,5,20], k = 2
Output: 37
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Monotonic Queue** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`004-Constrained-Subsequence-Sum.java`](./004-Constrained-Subsequence-Sum.java) in this folder — implement the `TODO` inside `ConstrainedSubsequenceSum.constrainedSubsequenceSum(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
