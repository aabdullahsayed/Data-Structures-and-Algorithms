# 007. Minimum Arrows to Burst Balloons

**Topic:** Intervals
**Difficulty:** Medium
**Solution file:** [`007-Minimum-Arrows-to-Burst-Balloons.java`](./007-Minimum-Arrows-to-Burst-Balloons.java)

## Problem

Given the start/end x-coordinates of balloons on a wall, find the minimum number of vertical arrows needed to burst all of them.

## Technique Reminder

Problems about ranges [start, end] — merging, overlapping, scheduling.

**Hint:** Sort intervals by start (or end) time first; most interval problems fall out from there.

## Example

```
Input:  points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
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

See [`007-Minimum-Arrows-to-Burst-Balloons.java`](./007-Minimum-Arrows-to-Burst-Balloons.java) in this folder — implement the `TODO` inside `MinimumArrowsToBurstBalloons.minimumArrowsToBurstBalloons(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
