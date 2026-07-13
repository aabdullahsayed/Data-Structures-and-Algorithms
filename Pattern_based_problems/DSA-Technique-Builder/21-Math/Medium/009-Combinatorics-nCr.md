# 009. Combinatorics nCr

**Topic:** Math
**Difficulty:** Medium
**Solution file:** [`009-Combinatorics-nCr.java`](./009-Combinatorics-nCr.java)

## Problem

Given n and r, compute nCr (the number of ways to choose r items out of n) modulo a large prime, using an efficient method (Pascal's triangle DP or modular inverse factorials).

## Technique Reminder

Number theory and mathematical algorithms.

**Hint:** Look for a formula or known algorithm (GCD, sieve, fast exponentiation) instead of brute force.

## Example

```
Input:  n = 5, r = 2
Output: 10
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Math** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`009-Combinatorics-nCr.java`](./009-Combinatorics-nCr.java) in this folder — implement the `TODO` inside `CombinatoricsNCr.combinatoricsNcr(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
