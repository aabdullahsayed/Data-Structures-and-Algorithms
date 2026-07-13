# 020. Max Water Between Bars

**Topic:** Two Pointers
**Difficulty:** Medium
**Solution file:** [`020-Max-Water-Between-Bars.java`](./020-Max-Water-Between-Bars.java)

## Problem

Given an array representing the heights of vertical bars (width 1 each), find two bars that, together with the x-axis, form a container that holds the maximum amount of water.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  [1, 8, 6, 2, 5, 4, 8, 3, 7]
Output: 49
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Two Pointers** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`020-Max-Water-Between-Bars.java`](./020-Max-Water-Between-Bars.java) in this folder — implement the `TODO` inside `MaxWaterBetweenBars.maxWaterBetweenBars(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
