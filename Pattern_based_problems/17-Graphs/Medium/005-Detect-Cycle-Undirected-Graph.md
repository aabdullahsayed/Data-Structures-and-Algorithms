# 005. Detect Cycle Undirected Graph

**Topic:** Graphs
**Difficulty:** Medium
**Solution file:** [`005-Detect-Cycle-Undirected-Graph.java`](./005-Detect-Cycle-Undirected-Graph.java)

## Problem

Given an undirected graph, determine whether it contains a cycle, using BFS or DFS with parent tracking.

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  n = 4, edges = [(0,1),(1,2),(2,3),(3,0)]
Output: true
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

See [`005-Detect-Cycle-Undirected-Graph.java`](./005-Detect-Cycle-Undirected-Graph.java) in this folder — implement the `TODO` inside `DetectCycleUndirectedGraph.detectCycleUndirectedGraph(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
