# 001. Merge Intervals Basic

**Topic:** Intervals
**Difficulty:** Easy
**Solution file:** [`001-Merge-Intervals-Basic.java`](./001-Merge-Intervals-Basic.java)

## Problem

Given a collection of intervals, merge all overlapping intervals and return the resulting non-overlapping set.

## Technique Reminder

Problems about ranges [start, end] — merging, overlapping, scheduling.

**Hint:** Sort intervals by start (or end) time first; most interval problems fall out from there.

## Example

```
Input:  intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
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

See [`001-Merge-Intervals-Basic.java`](./001-Merge-Intervals-Basic.java) in this folder — implement the `TODO` inside `MergeIntervalsBasic.mergeIntervalsBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
