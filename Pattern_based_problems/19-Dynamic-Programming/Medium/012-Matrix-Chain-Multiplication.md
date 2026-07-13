# 012. Matrix Chain Multiplication

**Topic:** Dynamic Programming
**Difficulty:** Medium
**Solution file:** [`012-Matrix-Chain-Multiplication.java`](./012-Matrix-Chain-Multiplication.java)

## Problem

Given the dimensions of a chain of matrices to be multiplied together, find the minimum number of scalar multiplications needed by choosing the optimal parenthesization/order.

## Technique Reminder

Break problems into overlapping subproblems and cache results to avoid recomputation.

**Hint:** Define state clearly, find the recurrence relation, then decide top-down (memo) or bottom-up (tabulation).

## Example

```
Input:  dims = [40,20,30,10,30]
Output: 26000
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Dynamic Programming** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`012-Matrix-Chain-Multiplication.java`](./012-Matrix-Chain-Multiplication.java) in this folder — implement the `TODO` inside `MatrixChainMultiplication.matrixChainMultiplication(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
