# 005. Jump Game VI

**Topic:** Monotonic Queue
**Difficulty:** Medium
**Solution file:** [`005-Jump-Game-VI.java`](./005-Jump-Game-VI.java)

## Problem

Given an array and an integer k, starting at index 0, you may jump forward to any index within k steps ahead. Find the maximum score (sum of values on visited indices, including the start and end) to reach the last index.

## Technique Reminder

A deque that stays monotonic, used for sliding-window max/min in O(n).

**Hint:** Push from the back, popping smaller/larger elements first; pop from the front when out of window.

## Example

```
Input:  arr = [1,-1,-2,4,-7,3], k = 2
Output: 7
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

See [`005-Jump-Game-VI.java`](./005-Jump-Game-VI.java) in this folder — implement the `TODO` inside `JumpGameVI.jumpGameVi(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
