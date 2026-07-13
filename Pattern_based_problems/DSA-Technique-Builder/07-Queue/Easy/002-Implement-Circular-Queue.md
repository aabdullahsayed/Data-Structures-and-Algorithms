# 002. Implement Circular Queue

**Topic:** Queue
**Difficulty:** Easy
**Solution file:** [`002-Implement-Circular-Queue.java`](./002-Implement-Circular-Queue.java)

## Problem

Implement a fixed-capacity circular queue that reuses freed space at the front of the underlying array instead of shifting elements.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  capacity=3; enqueue(1); enqueue(2); enqueue(3); dequeue(); enqueue(4)
Output: queue now holds [2,3,4] without shifting memory
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

See [`002-Implement-Circular-Queue.java`](./002-Implement-Circular-Queue.java) in this folder — implement the `TODO` inside `ImplementCircularQueue.implementCircularQueue(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
