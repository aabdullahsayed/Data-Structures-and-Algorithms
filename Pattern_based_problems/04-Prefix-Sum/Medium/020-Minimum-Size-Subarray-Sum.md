# 020. Minimum Size Subarray Sum

**Topic:** Prefix Sum
**Difficulty:** Medium
**Solution file:** [`020-Minimum-Size-Subarray-Sum.java`](./020-Minimum-Size-Subarray-Sum.java)

## Problem

Given an array of positive integers and a target sum, find the minimal length of a contiguous subarray whose sum is >= target. Return 0 if no such subarray exists.

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  arr = [2,3,1,2,4,3], target = 7
Output: 2
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Prefix Sum** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`020-Minimum-Size-Subarray-Sum.java`](./020-Minimum-Size-Subarray-Sum.java) in this folder — implement the `TODO` inside `MinimumSizeSubarraySum.minimumSizeSubarraySum(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
