# 006. Interval List Intersections

**Topic:** Intervals
**Difficulty:** Medium
**Solution file:** [`006-Interval-List-Intersections.java`](./006-Interval-List-Intersections.java)

## Problem

Given two lists of sorted, mutually disjoint intervals, return the list of intervals representing their intersection.

## Technique Reminder

Problems about ranges [start, end] — merging, overlapping, scheduling.

**Hint:** Sort intervals by start (or end) time first; most interval problems fall out from there.

## Example

```
Input:  A=[[0,2],[5,10]], B=[[1,5],[8,12]]
Output: [[1,2],[5,5],[8,10]]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Intervals** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`006-Interval-List-Intersections.java`](./006-Interval-List-Intersections.java) in this folder — implement the `TODO` inside `IntervalListIntersections.intervalListIntersections(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
