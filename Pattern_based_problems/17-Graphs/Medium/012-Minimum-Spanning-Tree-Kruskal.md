# 012. Minimum Spanning Tree Kruskal

**Topic:** Graphs
**Difficulty:** Medium
**Solution file:** [`012-Minimum-Spanning-Tree-Kruskal.java`](./012-Minimum-Spanning-Tree-Kruskal.java)

## Problem

Given a weighted undirected graph, find the total weight of its Minimum Spanning Tree using Kruskal's algorithm (sort edges by weight, add via Union-Find, skip cycles).

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  n = 4, weighted edges
Output: total MST weight
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

See [`012-Minimum-Spanning-Tree-Kruskal.java`](./012-Minimum-Spanning-Tree-Kruskal.java) in this folder — implement the `TODO` inside `MinimumSpanningTreeKruskal.minimumSpanningTreeKruskal(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
