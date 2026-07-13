# 002. Insert Interval

**Topic:** Intervals
**Difficulty:** Easy
**Solution file:** [`002-Insert-Interval.java`](./002-Insert-Interval.java)

## Problem

Given a set of non-overlapping intervals sorted by start time and a new interval, insert the new interval into the set, merging as needed to keep it non-overlapping and sorted.

## Technique Reminder

Problems about ranges [start, end] — merging, overlapping, scheduling.

**Hint:** Sort intervals by start (or end) time first; most interval problems fall out from there.

## Example

```
Input:  intervals=[[1,3],[6,9]], newInterval=[2,5]
Output: [[1,5],[6,9]]
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

See [`002-Insert-Interval.java`](./002-Insert-Interval.java) in this folder — implement the `TODO` inside `InsertInterval.insertInterval(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
