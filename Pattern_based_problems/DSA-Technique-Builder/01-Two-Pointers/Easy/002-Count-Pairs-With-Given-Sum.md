# 002. Count Pairs With Given Sum

**Topic:** Two Pointers
**Difficulty:** Easy
**Solution file:** [`002-Count-Pairs-With-Given-Sum.java`](./002-Count-Pairs-With-Given-Sum.java)

## Problem

Given a sorted array, count how many pairs (i, j) with i < j have arr[i] + arr[j] equal to a given target sum.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  arr = [1, 2, 3, 4, 5], target = 6
Output: 2   (pairs: (1,5), (2,4))
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

See [`002-Count-Pairs-With-Given-Sum.java`](./002-Count-Pairs-With-Given-Sum.java) in this folder — implement the `TODO` inside `CountPairsWithGivenSum.countPairsWithGivenSum(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
