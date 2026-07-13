# 007. Sum of Subarray Minimums

**Topic:** Monotonic Stack
**Difficulty:** Medium
**Solution file:** [`007-Sum-of-Subarray-Minimums.java`](./007-Sum-of-Subarray-Minimums.java)

## Problem

Given an array, compute the sum of min(subarray) over every contiguous subarray, modulo 1e9+7, using a monotonic stack to find each element's contribution range.

## Technique Reminder

A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).

**Hint:** Pop elements that violate the monotonic property before pushing the new one.

## Example

```
Input:  arr = [3,1,2,4]
Output: 17
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Monotonic Stack** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`007-Sum-of-Subarray-Minimums.java`](./007-Sum-of-Subarray-Minimums.java) in this folder — implement the `TODO` inside `SumOfSubarrayMinimums.sumOfSubarrayMinimums(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
