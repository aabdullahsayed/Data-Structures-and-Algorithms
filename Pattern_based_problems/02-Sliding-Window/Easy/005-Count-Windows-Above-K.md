# 005. Count Windows Above K

**Topic:** Sliding Window
**Difficulty:** Easy
**Solution file:** [`005-Count-Windows-Above-K.java`](./005-Count-Windows-Above-K.java)

## Problem

Given an array and window size w, count how many contiguous windows of size w have a sum strictly greater than a given threshold K.

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  arr = [1,4,2,10,2,3,1,0,20], w = 4, K = 10
Output: 3
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

See [`005-Count-Windows-Above-K.java`](./005-Count-Windows-Above-K.java) in this folder — implement the `TODO` inside `CountWindowsAboveK.countWindowsAboveK(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
