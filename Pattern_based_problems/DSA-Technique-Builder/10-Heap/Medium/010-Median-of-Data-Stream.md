# 010. Median of Data Stream

**Topic:** Heap
**Difficulty:** Medium
**Solution file:** [`010-Median-of-Data-Stream.java`](./010-Median-of-Data-Stream.java)

## Problem

Design a data structure that supports adding integers one at a time and finding the median of all elements seen so far in O(log n), using a max-heap for the lower half and a min-heap for the upper half.

## Technique Reminder

Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.

**Hint:** Ask whether you repeatedly need the current min/max/kth extreme value.

## Example

```
Input:  addNum(1); addNum(2); findMedian(); addNum(3); findMedian()
Output: 1.5, then 2
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

See [`010-Median-of-Data-Stream.java`](./010-Median-of-Data-Stream.java) in this folder — implement the `TODO` inside `MedianOfDataStream.medianOfDataStream(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
