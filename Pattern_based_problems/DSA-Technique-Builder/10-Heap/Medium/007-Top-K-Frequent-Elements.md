# 007. Top K Frequent Elements

**Topic:** Heap
**Difficulty:** Medium
**Solution file:** [`007-Top-K-Frequent-Elements.java`](./007-Top-K-Frequent-Elements.java)

## Problem

Given an array, find the k most frequently occurring elements, using a heap keyed by frequency.

## Technique Reminder

Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.

**Hint:** Ask whether you repeatedly need the current min/max/kth extreme value.

## Example

```
Input:  arr = [1,1,1,2,2,3], k = 2
Output: [1,2]
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

See [`007-Top-K-Frequent-Elements.java`](./007-Top-K-Frequent-Elements.java) in this folder — implement the `TODO` inside `TopKFrequentElements.topKFrequentElements(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
