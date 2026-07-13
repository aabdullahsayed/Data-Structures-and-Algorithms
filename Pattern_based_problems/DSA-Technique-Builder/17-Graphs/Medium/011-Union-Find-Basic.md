# 011. Union Find Basic

**Topic:** Graphs
**Difficulty:** Medium
**Solution file:** [`011-Union-Find-Basic.java`](./011-Union-Find-Basic.java)

## Problem

Implement a Disjoint Set Union (Union-Find) data structure supporting union(a,b) and find(a), using path compression and union by rank/size for near O(1) operations.

## Technique Reminder

Graph representation and traversal (BFS/DFS), shortest paths, connectivity.

**Hint:** Decide: adjacency list or matrix? BFS (shortest path/levels) or DFS (exploration/backtracking)?

## Example

```
Input:  union(1,2); union(2,3); find(1) == find(3)?
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

See [`011-Union-Find-Basic.java`](./011-Union-Find-Basic.java) in this folder — implement the `TODO` inside `UnionFindBasic.unionFindBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
