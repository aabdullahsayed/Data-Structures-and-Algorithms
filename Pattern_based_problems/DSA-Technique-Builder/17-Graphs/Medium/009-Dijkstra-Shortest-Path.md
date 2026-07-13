# 009. Dijkstra Shortest Path

**Topic:** Graphs
**Difficulty:** Medium
**Solution file:** [`009-Dijkstra-Shortest-Path.java`](./009-Dijkstra-Shortest-Path.java)

## Problem

Given a weighted graph with non-negative edge weights and a source node, find the shortest distance from the source to every other node, using a min-heap.

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  n = 5, weighted edges, source = 0
Output: array of shortest distances from node 0
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

See [`009-Dijkstra-Shortest-Path.java`](./009-Dijkstra-Shortest-Path.java) in this folder — implement the `TODO` inside `DijkstraShortestPath.dijkstraShortestPath(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
