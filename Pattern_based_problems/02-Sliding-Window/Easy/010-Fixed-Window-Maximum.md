# 010. Fixed Window Maximum

**Topic:** Sliding Window
**Difficulty:** Easy
**Solution file:** [`010-Fixed-Window-Maximum.java`](./010-Fixed-Window-Maximum.java)

## Problem

Given an array and window size k, find the maximum element in every contiguous window of size k (basic O(n*k) version is fine here).

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  arr = [9,7,2,4,6,8,2,1,5], k = 3
Output: 9 7 6 8 8 8 5
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

See [`010-Fixed-Window-Maximum.java`](./010-Fixed-Window-Maximum.java) in this folder — implement the `TODO` inside `FixedWindowMaximum.fixedWindowMaximum(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
