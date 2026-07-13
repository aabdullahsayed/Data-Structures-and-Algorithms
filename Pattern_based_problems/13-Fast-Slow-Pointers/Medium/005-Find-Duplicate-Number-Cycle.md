# 005. Find Duplicate Number Cycle

**Topic:** Fast Slow Pointers
**Difficulty:** Medium
**Solution file:** [`005-Find-Duplicate-Number-Cycle.java`](./005-Find-Duplicate-Number-Cycle.java)

## Problem

Given an array of n+1 integers where each value is between 1 and n, find the duplicate number by treating the array as an implicit linked list (arr[i] points to index arr[i]) and applying Floyd's cycle detection.

## Technique Reminder

Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.

**Hint:** slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.

## Example

```
Input:  arr = [1,3,4,2,2]
Output: 2
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Fast Slow Pointers** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`005-Find-Duplicate-Number-Cycle.java`](./005-Find-Duplicate-Number-Cycle.java) in this folder — implement the `TODO` inside `FindDuplicateNumberCycle.findDuplicateNumberCycle(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
