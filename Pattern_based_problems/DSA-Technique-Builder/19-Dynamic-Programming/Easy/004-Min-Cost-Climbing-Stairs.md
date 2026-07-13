# 004. Min Cost Climbing Stairs

**Topic:** Dynamic Programming
**Difficulty:** Easy
**Solution file:** [`004-Min-Cost-Climbing-Stairs.java`](./004-Min-Cost-Climbing-Stairs.java)

## Problem

Given an array of costs where cost[i] is paid to step onto stair i, and you can climb 1 or 2 steps at a time starting from step 0 or step 1, find the minimum total cost to reach the top of the staircase.

## Technique Reminder

Break problems into overlapping subproblems and cache results to avoid recomputation.

**Hint:** Define state clearly, find the recurrence relation, then decide top-down (memo) or bottom-up (tabulation).

## Example

```
Input:  cost = [10,15,20]
Output: 15
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

See [`004-Min-Cost-Climbing-Stairs.java`](./004-Min-Cost-Climbing-Stairs.java) in this folder — implement the `TODO` inside `MinCostClimbingStairs.minCostClimbingStairs(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
