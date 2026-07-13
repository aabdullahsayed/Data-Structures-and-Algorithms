# 006. Reverse Part of Array

**Topic:** Two Pointers
**Difficulty:** Easy
**Solution file:** [`006-Reverse-Part-of-Array.java`](./006-Reverse-Part-of-Array.java)

## Problem

Given an array and two indices l and r, reverse only the subarray between indices l and r (inclusive) in-place, leaving the rest of the array untouched.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  arr = [1, 2, 3, 4, 5], l = 1, r = 3
Output: [1, 4, 3, 2, 5]
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

See [`006-Reverse-Part-of-Array.java`](./006-Reverse-Part-of-Array.java) in this folder — implement the `TODO` inside `ReversePartOfArray.reversePartOfArray(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
