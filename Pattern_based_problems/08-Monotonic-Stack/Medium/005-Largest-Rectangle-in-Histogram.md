# 005. Largest Rectangle in Histogram

**Topic:** Monotonic Stack
**Difficulty:** Medium
**Solution file:** [`005-Largest-Rectangle-in-Histogram.java`](./005-Largest-Rectangle-in-Histogram.java)

## Problem

Given histogram bar heights, find the area of the largest rectangle, using a monotonic increasing stack in O(n) time.

## Technique Reminder

A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).

**Hint:** Pop elements that violate the monotonic property before pushing the new one.

## Example

```
Input:  heights = [2,1,5,6,2,3]
Output: 10
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

See [`005-Largest-Rectangle-in-Histogram.java`](./005-Largest-Rectangle-in-Histogram.java) in this folder — implement the `TODO` inside `LargestRectangleInHistogram.largestRectangleInHistogram(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
