# 006. Interleave Two Halves of Queue

**Topic:** Queue
**Difficulty:** Easy
**Solution file:** [`006-Interleave-Two-Halves-of-Queue.java`](./006-Interleave-Two-Halves-of-Queue.java)

## Problem

Given a queue with an even number of elements, split it into two halves and interleave them (like a perfect riffle shuffle) using only queue/stack operations.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  queue = [1,2,3,4,5,6]
Output: [1,4,2,5,3,6]
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

See [`006-Interleave-Two-Halves-of-Queue.java`](./006-Interleave-Two-Halves-of-Queue.java) in this folder — implement the `TODO` inside `InterleaveTwoHalvesOfQueue.interleaveTwoHalvesOfQueue(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
