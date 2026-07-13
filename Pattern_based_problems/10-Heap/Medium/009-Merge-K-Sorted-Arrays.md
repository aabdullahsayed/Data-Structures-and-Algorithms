# 009. Merge K Sorted Arrays

**Topic:** Heap
**Difficulty:** Medium
**Solution file:** [`009-Merge-K-Sorted-Arrays.java`](./009-Merge-K-Sorted-Arrays.java)

## Problem

Given k sorted arrays, merge them into one sorted array using a min-heap that always holds the current smallest unmerged element from each array.

## Technique Reminder

Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.

**Hint:** Ask whether you repeatedly need the current min/max/kth extreme value.

## Example

```
Input:  arrays = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
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

See [`009-Merge-K-Sorted-Arrays.java`](./009-Merge-K-Sorted-Arrays.java) in this folder — implement the `TODO` inside `MergeKSortedArrays.mergeKSortedArrays(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
