# 005. Sort Nearly Sorted Array

**Topic:** Heap
**Difficulty:** Easy
**Solution file:** [`005-Sort-Nearly-Sorted-Array.java`](./005-Sort-Nearly-Sorted-Array.java)

## Problem

Given an array where every element is at most k positions away from its correct sorted position, sort it efficiently using a min-heap of size k+1.

## Technique Reminder

Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.

**Hint:** Ask whether you repeatedly need the current min/max/kth extreme value.

## Example

```
Input:  arr = [6,5,3,2,8,10,9], k = 3
Output: [2,3,5,6,8,9,10]
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

See [`005-Sort-Nearly-Sorted-Array.java`](./005-Sort-Nearly-Sorted-Array.java) in this folder — implement the `TODO` inside `SortNearlySortedArray.sortNearlySortedArray(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
