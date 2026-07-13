# 006. Check Max Heap

**Topic:** Heap
**Difficulty:** Easy
**Solution file:** [`006-Check-Max-Heap.java`](./006-Check-Max-Heap.java)

## Problem

Given an array representing a binary tree in 0-indexed heap layout, determine whether it satisfies the max-heap property (every parent >= its children).

## Technique Reminder

Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.

**Hint:** Ask whether you repeatedly need the current min/max/kth extreme value.

## Example

```
Input:  arr = [90,15,10,7,12,2,7,3]
Output: true
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Heap** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`006-Check-Max-Heap.java`](./006-Check-Max-Heap.java) in this folder — implement the `TODO` inside `CheckMaxHeap.checkMaxHeap(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
