# 001. Detect Cycle in Linked List

**Topic:** Fast Slow Pointers
**Difficulty:** Easy
**Solution file:** [`001-Detect-Cycle-in-Linked-List.java`](./001-Detect-Cycle-in-Linked-List.java)

## Problem

Given the head of a linked list, determine whether it contains a cycle, using Floyd's fast/slow pointer algorithm (no extra memory).

## Technique Reminder

Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.

**Hint:** slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.

## Example

```
Input:  a list where the tail connects back into an earlier node
Output: true
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

See [`001-Detect-Cycle-in-Linked-List.java`](./001-Detect-Cycle-in-Linked-List.java) in this folder — implement the `TODO` inside `DetectCycleInLinkedList.detectCycleInLinkedList(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
