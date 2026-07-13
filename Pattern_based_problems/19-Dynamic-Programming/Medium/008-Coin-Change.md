# 008. Coin Change

**Topic:** Dynamic Programming
**Difficulty:** Medium
**Solution file:** [`008-Coin-Change.java`](./008-Coin-Change.java)

## Problem

Given a set of coin denominations and a target amount, find the minimum number of coins needed to make that amount (unlimited supply of each coin), or -1 if it's impossible.

## Technique Reminder

Break problems into overlapping subproblems and cache results to avoid recomputation.

**Hint:** Define state clearly, find the recurrence relation, then decide top-down (memo) or bottom-up (tabulation).

## Example

```
Input:  coins = [1,2,5], amount = 11
Output: 3
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

See [`008-Coin-Change.java`](./008-Coin-Change.java) in this folder — implement the `TODO` inside `CoinChange.coinChange(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
