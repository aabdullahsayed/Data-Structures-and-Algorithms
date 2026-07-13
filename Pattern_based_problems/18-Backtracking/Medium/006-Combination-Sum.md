# 006. Combination Sum

**Topic:** Backtracking
**Difficulty:** Medium
**Solution file:** [`006-Combination-Sum.java`](./006-Combination-Sum.java)

## Problem

Given an array of distinct positive integers and a target, find all unique combinations of numbers (each number may be reused any number of times) that sum exactly to the target.

## Technique Reminder

Explore all possibilities via recursion, undoing choices that don't work (prune early).

**Hint:** Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.

## Example

```
Input:  candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Backtracking** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`006-Combination-Sum.java`](./006-Combination-Sum.java) in this folder — implement the `TODO` inside `CombinationSum.combinationSum(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
