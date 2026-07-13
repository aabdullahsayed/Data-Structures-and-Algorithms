# 019. Count Pairs With Given Difference

**Topic:** Hashing
**Difficulty:** Medium
**Solution file:** [`019-Count-Pairs-With-Given-Difference.java`](./019-Count-Pairs-With-Given-Difference.java)

## Problem

Given an array and a value k, count the number of pairs (i, j) such that arr[i] - arr[j] == k.

## Technique Reminder

Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops.

**Hint:** Ask: what do I need to remember about elements I've already seen?

## Example

```
Input:  arr = [1,5,3,4,2], k = 3
Output: 2
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Hashing** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`019-Count-Pairs-With-Given-Difference.java`](./019-Count-Pairs-With-Given-Difference.java) in this folder — implement the `TODO` inside `CountPairsWithGivenDifference.countPairsWithGivenDifference(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
