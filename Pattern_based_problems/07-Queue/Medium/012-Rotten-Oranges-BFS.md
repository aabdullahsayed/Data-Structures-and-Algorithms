# 012. Rotten Oranges BFS

**Topic:** Queue
**Difficulty:** Medium
**Solution file:** [`012-Rotten-Oranges-BFS.java`](./012-Rotten-Oranges-BFS.java)

## Problem

Given a grid where each cell is empty, a fresh orange, or a rotten orange, find the minimum number of minutes until no fresh orange remains, using multi-source BFS from all initially rotten oranges. Return -1 if it's impossible.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Queue** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`012-Rotten-Oranges-BFS.java`](./012-Rotten-Oranges-BFS.java) in this folder — implement the `TODO` inside `RottenOrangesBFS.rottenOrangesBfs(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
