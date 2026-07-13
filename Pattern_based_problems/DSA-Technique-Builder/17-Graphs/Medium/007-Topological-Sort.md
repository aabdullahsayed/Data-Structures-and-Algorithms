# 007. Topological Sort

**Topic:** Graphs
**Difficulty:** Medium
**Solution file:** [`007-Topological-Sort.java`](./007-Topological-Sort.java)

## Problem

Given a Directed Acyclic Graph (DAG), find a valid topological ordering of its nodes.

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  n = 6, edges = [(5,2),(5,0),(4,0),(4,1),(2,3),(3,1)]
Output: [5,4,2,3,1,0]  (one valid ordering)
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

See [`007-Topological-Sort.java`](./007-Topological-Sort.java) in this folder — implement the `TODO` inside `TopologicalSort.topologicalSort(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
