# 004. Find Cycle Start Node

**Topic:** Fast Slow Pointers
**Difficulty:** Medium
**Solution file:** [`004-Find-Cycle-Start-Node.java`](./004-Find-Cycle-Start-Node.java)

## Problem

Given a linked list that contains a cycle, find the node where the cycle begins, using Floyd's algorithm (detect the meeting point, then find the entry node).

## Technique Reminder

Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.

**Hint:** slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.

## Example

```
Input:  list where the cycle begins at the node with value 2
Output: node with value 2
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

See [`004-Find-Cycle-Start-Node.java`](./004-Find-Cycle-Start-Node.java) in this folder — implement the `TODO` inside `FindCycleStartNode.findCycleStartNode(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
