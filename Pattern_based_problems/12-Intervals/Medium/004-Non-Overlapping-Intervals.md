# 004. Non Overlapping Intervals

**Topic:** Intervals
**Difficulty:** Medium
**Solution file:** [`004-Non-Overlapping-Intervals.java`](./004-Non-Overlapping-Intervals.java)

## Problem

Given a set of intervals, find the minimum number of intervals you must remove so that the remaining intervals are non-overlapping.

## Technique Reminder

Problems about ranges [start, end] — merging, overlapping, scheduling.

**Hint:** Sort intervals by start (or end) time first; most interval problems fall out from there.

## Example

```
Input:  intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
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

See [`004-Non-Overlapping-Intervals.java`](./004-Non-Overlapping-Intervals.java) in this folder — implement the `TODO` inside `NonOverlappingIntervals.nonOverlappingIntervals(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
