# 010. Bellman Ford

**Topic:** Graphs
**Difficulty:** Medium
**Solution file:** [`010-Bellman-Ford.java`](./010-Bellman-Ford.java)

## Problem

Given a weighted graph (edges may be negative, but assume no negative-weight cycle initially) and a source node, find shortest distances from the source using the Bellman-Ford algorithm, and also detect if a negative cycle exists.

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  graph with at least one negative edge, source = 0
Output: array of shortest distances, or a 'negative cycle detected' flag
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

See [`010-Bellman-Ford.java`](./010-Bellman-Ford.java) in this folder — implement the `TODO` inside `BellmanFord.bellmanFord(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
