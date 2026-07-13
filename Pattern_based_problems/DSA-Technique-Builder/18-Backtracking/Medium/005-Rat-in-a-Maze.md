# 005. Rat in a Maze

**Topic:** Backtracking
**Difficulty:** Medium
**Solution file:** [`005-Rat-in-a-Maze.java`](./005-Rat-in-a-Maze.java)

## Problem

Given an n x n maze of 0s (blocked) and 1s (open), find all distinct paths for a rat to travel from the top-left cell to the bottom-right cell, moving only through open cells.

## Technique Reminder

Explore all possibilities via recursion, undoing choices that don't work (prune early).

**Hint:** Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.

## Example

```
Input:  maze = [[1,0,0,0],[1,1,0,1],[1,1,0,0],[0,1,1,1]]
Output: ["DDRDRR"]
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

See [`005-Rat-in-a-Maze.java`](./005-Rat-in-a-Maze.java) in this folder — implement the `TODO` inside `RatInAMaze.ratInAMaze(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
