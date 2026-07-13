# 008. Reverse First K Elements

**Topic:** Queue
**Difficulty:** Easy
**Solution file:** [`008-Reverse-First-K-Elements.java`](./008-Reverse-First-K-Elements.java)

## Problem

Given a queue and an integer k, reverse the order of the first k elements while leaving the rest of the queue's order unchanged.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  queue = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
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

See [`008-Reverse-First-K-Elements.java`](./008-Reverse-First-K-Elements.java) in this folder — implement the `TODO` inside `ReverseFirstKElements.reverseFirstKElements(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
