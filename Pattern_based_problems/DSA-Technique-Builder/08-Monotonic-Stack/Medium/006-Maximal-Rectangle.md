# 006. Maximal Rectangle

**Topic:** Monotonic Stack
**Difficulty:** Medium
**Solution file:** [`006-Maximal-Rectangle.java`](./006-Maximal-Rectangle.java)

## Problem

Given a binary matrix, find the area of the largest rectangle containing only 1s, by treating each row as the base of a histogram and reusing the largest-rectangle technique row by row.

## Technique Reminder

A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).

**Hint:** Pop elements that violate the monotonic property before pushing the new one.

## Example

```
Input:  matrix = [[1,0,1,0,0],[1,0,1,1,1],[1,1,1,1,1],[1,0,0,1,0]]
Output: 6
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Monotonic Stack** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`006-Maximal-Rectangle.java`](./006-Maximal-Rectangle.java) in this folder — implement the `TODO` inside `MaximalRectangle.maximalRectangle(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
