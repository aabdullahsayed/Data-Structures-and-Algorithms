# 014. Find Pair Closest to X

**Topic:** Two Pointers
**Difficulty:** Easy
**Solution file:** [`014-Find-Pair-Closest-to-X.java`](./014-Find-Pair-Closest-to-X.java)

## Problem

Given a sorted array and a value X, find the pair of elements whose sum is closest to X.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  arr = [1, 3, 5, 8, 12], X = 10
Output: (1, 8) -> sum = 9  (closest possible sum)
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

See [`014-Find-Pair-Closest-to-X.java`](./014-Find-Pair-Closest-to-X.java) in this folder — implement the `TODO` inside `FindPairClosestToX.findPairClosestToX(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
