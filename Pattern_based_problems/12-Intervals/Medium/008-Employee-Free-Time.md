# 008. Employee Free Time

**Topic:** Intervals
**Difficulty:** Medium
**Solution file:** [`008-Employee-Free-Time.java`](./008-Employee-Free-Time.java)

## Problem

Given a list of employees' schedules (each a sorted list of non-overlapping intervals for that employee), find the common free time intervals shared by all employees.

## Technique Reminder

Problems about ranges [start, end] — merging, overlapping, scheduling.

**Hint:** Sort intervals by start (or end) time first; most interval problems fall out from there.

## Example

```
Input:  schedules = [[[1,2],[5,6]], [[1,3]], [[4,10]]]
Output: [[3,4]]
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

See [`008-Employee-Free-Time.java`](./008-Employee-Free-Time.java) in this folder — implement the `TODO` inside `EmployeeFreeTime.employeeFreeTime(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
