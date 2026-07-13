# 003. Minimum Coins

**Topic:** Greedy
**Difficulty:** Easy
**Solution file:** [`003-Minimum-Coins.java`](./003-Minimum-Coins.java)

## Problem

Given a set of coin denominations (assume a canonical system, e.g. standard currency) and a target amount, find the minimum number of coins needed using a greedy approach (always take the largest coin that fits).

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  coins=[1,2,5,10], amount=27
Output: 4  (10+10+5+2)
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Greedy** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`003-Minimum-Coins.java`](./003-Minimum-Coins.java) in this folder — implement the `TODO` inside `MinimumCoins.minimumCoins(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
