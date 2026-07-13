# 007. 0 1 Knapsack

**Topic:** Dynamic Programming
**Difficulty:** Medium
**Solution file:** [`007-0-1-Knapsack.java`](./007-0-1-Knapsack.java)

## Problem

Given weights and values of n items and a knapsack of capacity W, find the maximum total value achievable without exceeding capacity, where each item can be used at most once.

## Technique Reminder

Break problems into overlapping subproblems and cache results to avoid recomputation.

**Hint:** Define state clearly, find the recurrence relation, then decide top-down (memo) or bottom-up (tabulation).

## Example

```
Input:  weights=[1,3,4,5], values=[1,4,5,7], W=7
Output: 9
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

See [`007-0-1-Knapsack.java`](./007-0-1-Knapsack.java) in this folder — implement the `TODO` inside `01Knapsack.01Knapsack(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
