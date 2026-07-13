# 001. Sliding Window Maximum Basic

**Topic:** Monotonic Queue
**Difficulty:** Easy
**Solution file:** [`001-Sliding-Window-Maximum-Basic.java`](./001-Sliding-Window-Maximum-Basic.java)

## Problem

Given an array and window size k, find the maximum value in every window of size k, using a monotonic decreasing deque.

## Technique Reminder

A deque that stays monotonic, used for sliding-window max/min in O(n).

**Hint:** Push from the back, popping smaller/larger elements first; pop from the front when out of window.

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
2. Identify why the **Monotonic Queue** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`001-Sliding-Window-Maximum-Basic.java`](./001-Sliding-Window-Maximum-Basic.java) in this folder — implement the `TODO` inside `SlidingWindowMaximumBasic.slidingWindowMaximumBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
