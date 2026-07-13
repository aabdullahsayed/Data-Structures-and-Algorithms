# 008. Number of Islands

**Topic:** Graphs
**Difficulty:** Medium
**Solution file:** [`008-Number-of-Islands.java`](./008-Number-of-Islands.java)

## Problem

Given a 2D grid of '1's (land) and '0's (water), count the number of islands (maximal groups of land cells connected 4-directionally).

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  grid = [[1,1,0],[0,1,0],[0,0,1]]
Output: 2
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Graphs** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`008-Number-of-Islands.java`](./008-Number-of-Islands.java) in this folder — implement the `TODO` inside `NumberOfIslands.numberOfIslands(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
