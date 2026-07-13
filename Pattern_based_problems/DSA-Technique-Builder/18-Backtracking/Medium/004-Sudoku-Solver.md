# 004. Sudoku Solver

**Topic:** Backtracking
**Difficulty:** Medium
**Solution file:** [`004-Sudoku-Solver.java`](./004-Sudoku-Solver.java)

## Problem

Given a partially filled 9x9 Sudoku board, fill the empty cells so the completed board satisfies all Sudoku rules.

## Technique Reminder

Explore all possibilities via recursion, undoing choices that don't work (prune early).

**Hint:** Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.

## Example

```
Input:  a standard 9x9 board with blank cells
Output: the completed, valid board
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

See [`004-Sudoku-Solver.java`](./004-Sudoku-Solver.java) in this folder — implement the `TODO` inside `SudokuSolver.sudokuSolver(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
