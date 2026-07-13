# 004. Average of Every Window

**Topic:** Sliding Window
**Difficulty:** Easy
**Solution file:** [`004-Average-of-Every-Window.java`](./004-Average-of-Every-Window.java)

## Problem

Given an array and window size k, compute the average of every contiguous subarray of size k.

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  arr = [1,3,2,6,-1,4,1,8,2], k = 5
Output: 2.2 2.8 2.4 3.6 2.8
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

See [`004-Average-of-Every-Window.java`](./004-Average-of-Every-Window.java) in this folder — implement the `TODO` inside `AverageOfEveryWindow.averageOfEveryWindow(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
