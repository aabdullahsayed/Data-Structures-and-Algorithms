# 016. Four Sum Count

**Topic:** Hashing
**Difficulty:** Medium
**Solution file:** [`016-Four-Sum-Count.java`](./016-Four-Sum-Count.java)

## Problem

Given four arrays of equal length, count how many tuples (i, j, k, l) exist such that A[i] + B[j] + C[k] + D[l] == 0.

## Technique Reminder

Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops.

**Hint:** Ask: what do I need to remember about elements I've already seen?

## Example

```
Input:  A=[1,2], B=[-2,-1], C=[-1,2], D=[0,2]
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

See [`016-Four-Sum-Count.java`](./016-Four-Sum-Count.java) in this folder — implement the `TODO` inside `FourSumCount.fourSumCount(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
