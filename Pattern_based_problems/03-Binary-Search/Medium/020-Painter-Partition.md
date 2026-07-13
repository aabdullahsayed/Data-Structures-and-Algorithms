# 020. Painter Partition

**Topic:** Binary Search
**Difficulty:** Medium
**Solution file:** [`020-Painter-Partition.java`](./020-Painter-Partition.java)

## Problem

Given the lengths of boards and k painters (each painter paints a contiguous set of boards, one unit length per unit time, all painters work in parallel), find the minimum time needed to paint all boards.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  boards = [10,20,30,40], k = 2
Output: 60
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Binary Search** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`020-Painter-Partition.java`](./020-Painter-Partition.java) in this folder — implement the `TODO` inside `PainterPartition.painterPartition(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
