# 007. Move All Zeros

**Topic:** Two Pointers
**Difficulty:** Easy
**Solution file:** [`007-Move-All-Zeros.java`](./007-Move-All-Zeros.java)

## Problem

Given an array, move all zeros to the end while keeping the relative order of the non-zero elements. Do this in-place without using extra space.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
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

See [`007-Move-All-Zeros.java`](./007-Move-All-Zeros.java) in this folder — implement the `TODO` inside `MoveAllZeros.moveAllZeros(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
