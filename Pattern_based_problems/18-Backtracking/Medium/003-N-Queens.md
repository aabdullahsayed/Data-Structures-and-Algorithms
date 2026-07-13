# 003. N Queens

**Topic:** Backtracking
**Difficulty:** Medium
**Solution file:** [`003-N-Queens.java`](./003-N-Queens.java)

## Problem

Given an integer n, place n queens on an n x n chessboard so that no two queens attack each other, and return all distinct valid board configurations.

## Technique Reminder

Explore all possibilities via recursion, undoing choices that don't work (prune early).

**Hint:** Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.

## Example

```
Input:  n = 4
Output: 2 distinct solutions
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

See [`003-N-Queens.java`](./003-N-Queens.java) in this folder — implement the `TODO` inside `NQueens.nQueens(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
