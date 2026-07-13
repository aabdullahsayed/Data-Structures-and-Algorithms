# 013. Rotated Array

**Topic:** Binary Search
**Difficulty:** Medium
**Solution file:** [`013-Rotated-Array.java`](./013-Rotated-Array.java)

## Problem

Given a sorted array that has been rotated at an unknown pivot, find the index of a target value in O(log n) time.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  arr = [4,5,6,7,0,1,2], target = 0
Output: 4
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Binary Search** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`013-Rotated-Array.java`](./013-Rotated-Array.java) in this folder — implement the `TODO` inside `RotatedArray.rotatedArray(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
