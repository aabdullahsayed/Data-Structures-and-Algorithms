# 008. Move Negatives Left

**Topic:** Two Pointers
**Difficulty:** Easy
**Solution file:** [`008-Move-Negatives-Left.java`](./008-Move-Negatives-Left.java)

## Problem

Given an array of positive and negative integers, rearrange it in-place so that all negative numbers appear before all positive numbers. Order within each group does not matter.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  [-1, 2, -3, 4, 5, -6]
Output: [-1, -3, -6, 4, 5, 2]  (one valid arrangement)
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

See [`008-Move-Negatives-Left.java`](./008-Move-Negatives-Left.java) in this folder — implement the `TODO` inside `MoveNegativesLeft.moveNegativesLeft(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
