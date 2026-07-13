# 009. Longest All Positive

**Topic:** Sliding Window
**Difficulty:** Easy
**Solution file:** [`009-Longest-All-Positive.java`](./009-Longest-All-Positive.java)

## Problem

Given an array of integers, find the length of the longest contiguous subarray containing only positive numbers.

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  arr = [1,2,-1,3,4,5,-2,1]
Output: 3   (subarray [3,4,5])
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

See [`009-Longest-All-Positive.java`](./009-Longest-All-Positive.java) in this folder — implement the `TODO` inside `LongestAllPositive.longestAllPositive(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
