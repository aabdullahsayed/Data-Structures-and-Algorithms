# 002. Climbing Stairs

**Topic:** Dynamic Programming
**Difficulty:** Easy
**Solution file:** [`002-Climbing-Stairs.java`](./002-Climbing-Stairs.java)

## Problem

You are climbing a staircase with n steps; each move you can climb 1 or 2 steps. Find how many distinct ways you can reach the top.

## Technique Reminder

Break problems into overlapping subproblems and cache results to avoid recomputation.

**Hint:** Define state clearly, find the recurrence relation, then decide top-down (memo) or bottom-up (tabulation).

## Example

```
Input:  n = 5
Output: 8
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

See [`002-Climbing-Stairs.java`](./002-Climbing-Stairs.java) in this folder — implement the `TODO` inside `ClimbingStairs.climbingStairs(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
