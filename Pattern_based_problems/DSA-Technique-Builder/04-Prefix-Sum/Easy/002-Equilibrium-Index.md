# 002. Equilibrium Index

**Topic:** Prefix Sum
**Difficulty:** Easy
**Solution file:** [`002-Equilibrium-Index.java`](./002-Equilibrium-Index.java)

## Problem

Given an array, find an index such that the sum of the elements strictly to its left equals the sum of the elements strictly to its right.

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  arr = [-7,1,5,2,-4,3,0]
Output: 3
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Prefix Sum** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`002-Equilibrium-Index.java`](./002-Equilibrium-Index.java) in this folder — implement the `TODO` inside `EquilibriumIndex.equilibriumIndex(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
