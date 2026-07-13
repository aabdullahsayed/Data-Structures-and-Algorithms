# 013. Task Scheduler Basic

**Topic:** Queue
**Difficulty:** Medium
**Solution file:** [`013-Task-Scheduler-Basic.java`](./013-Task-Scheduler-Basic.java)

## Problem

Given a list of tasks and a cooldown period n between two occurrences of the same task, find the minimum number of time units (including idle slots) needed to finish all tasks.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  tasks = [A,A,A,B,B,B], n = 2
Output: 8
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

See [`013-Task-Scheduler-Basic.java`](./013-Task-Scheduler-Basic.java) in this folder — implement the `TODO` inside `TaskSchedulerBasic.taskSchedulerBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
