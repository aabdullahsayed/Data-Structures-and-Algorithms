# 012. Connect Ropes Minimum Cost

**Topic:** Heap
**Difficulty:** Medium
**Solution file:** [`012-Connect-Ropes-Minimum-Cost.java`](./012-Connect-Ropes-Minimum-Cost.java)

## Problem

Given the lengths of several ropes, connect them all into one rope with minimum total cost, where the cost of connecting two ropes equals the sum of their lengths. Use a min-heap to always connect the two shortest ropes first.

## Technique Reminder

Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.

**Hint:** Ask whether you repeatedly need the current min/max/kth extreme value.

## Example

```
Input:  ropes = [4,3,2,6]
Output: 29
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

See [`012-Connect-Ropes-Minimum-Cost.java`](./012-Connect-Ropes-Minimum-Cost.java) in this folder — implement the `TODO` inside `ConnectRopesMinimumCost.connectRopesMinimumCost(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
