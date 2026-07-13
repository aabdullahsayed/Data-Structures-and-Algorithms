# 003. Shortest Subarray With Sum At Least K

**Topic:** Monotonic Queue
**Difficulty:** Medium
**Solution file:** [`003-Shortest-Subarray-With-Sum-At-Least-K.java`](./003-Shortest-Subarray-With-Sum-At-Least-K.java)

## Problem

Given an array (can include negative numbers) and an integer k, find the length of the shortest contiguous subarray whose sum is at least k, or -1 if no such subarray exists. Use prefix sums plus a monotonic deque.

## Technique Reminder

A deque that stays monotonic, used for sliding-window max/min in O(n).

**Hint:** Push from the back, popping smaller/larger elements first; pop from the front when out of window.

## Example

```
Input:  arr = [2,-1,2], k = 3
Output: 3
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

See [`003-Shortest-Subarray-With-Sum-At-Least-K.java`](./003-Shortest-Subarray-With-Sum-At-Least-K.java) in this folder — implement the `TODO` inside `ShortestSubarrayWithSumAtLeastK.shortestSubarrayWithSumAtLeastK(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
