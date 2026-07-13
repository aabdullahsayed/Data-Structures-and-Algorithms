# 009. Sliding Window Maximum Deque

**Topic:** Queue
**Difficulty:** Medium
**Solution file:** [`009-Sliding-Window-Maximum-Deque.java`](./009-Sliding-Window-Maximum-Deque.java)

## Problem

Given an array and window size k, find the maximum element in every window of size k, in O(n) total time using a deque.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  arr = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Queue** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`009-Sliding-Window-Maximum-Deque.java`](./009-Sliding-Window-Maximum-Deque.java) in this folder — implement the `TODO` inside `SlidingWindowMaximumDeque.slidingWindowMaximumDeque(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
