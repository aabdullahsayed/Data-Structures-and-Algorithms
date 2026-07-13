# 001. Graph Representation

**Topic:** Graphs
**Difficulty:** Easy
**Solution file:** [`001-Graph-Representation.java`](./001-Graph-Representation.java)

## Problem

Given a list of edges, build both an adjacency list and an adjacency matrix representation of the graph.

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  edges = [(0,1),(1,2),(2,0)]
Output: adjacency list {0:[1,2], 1:[0,2], 2:[1,0]}
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

See [`001-Graph-Representation.java`](./001-Graph-Representation.java) in this folder — implement the `TODO` inside `GraphRepresentation.graphRepresentation(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
