# 007. Modular Exponentiation

**Topic:** Math
**Difficulty:** Medium
**Solution file:** [`007-Modular-Exponentiation.java`](./007-Modular-Exponentiation.java)

## Problem

Given a base, an exponent, and a modulus, compute (base^exponent) % modulus efficiently in O(log exponent) time, keeping intermediate values within range.

## Technique Reminder

Number theory and mathematical algorithms.

**Hint:** Look for a formula or known algorithm (GCD, sieve, fast exponentiation) instead of brute force.

## Example

```
Input:  base = 2, exponent = 10, modulus = 1000000007
Output: 1024
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

See [`007-Modular-Exponentiation.java`](./007-Modular-Exponentiation.java) in this folder — implement the `TODO` inside `ModularExponentiation.modularExponentiation(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
