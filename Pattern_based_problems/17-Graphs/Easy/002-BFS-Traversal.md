# 002. BFS Traversal

**Topic:** Graphs
**Difficulty:** Easy
**Solution file:** [`002-BFS-Traversal.java`](./002-BFS-Traversal.java)

## Problem

Given a graph and a starting node, perform a breadth-first traversal and return the order in which nodes are visited.

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  edges = 0-1,0-2,1-2,2-3; start = 2
Output: [2,0,1,3]
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

See [`002-BFS-Traversal.java`](./002-BFS-Traversal.java) in this folder — implement the `TODO` inside `BFSTraversal.bfsTraversal(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
