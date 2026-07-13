# 008. K Closest Points to Origin

**Topic:** Heap
**Difficulty:** Medium
**Solution file:** [`008-K-Closest-Points-to-Origin.java`](./008-K-Closest-Points-to-Origin.java)

## Problem

Given a list of points on a 2D plane, find the k points closest to the origin (by Euclidean distance), using a heap.

## Technique Reminder

Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.

**Hint:** Ask whether you repeatedly need the current min/max/kth extreme value.

## Example

```
Input:  points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Heap** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`008-K-Closest-Points-to-Origin.java`](./008-K-Closest-Points-to-Origin.java) in this folder — implement the `TODO` inside `KClosestPointsToOrigin.kClosestPointsToOrigin(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
