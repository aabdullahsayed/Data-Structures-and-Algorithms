# 012. Longest Subarray With Sum K

**Topic:** Prefix Sum
**Difficulty:** Medium
**Solution file:** [`012-Longest-Subarray-With-Sum-K.java`](./012-Longest-Subarray-With-Sum-K.java)

## Problem

Given an array of integers (may include negatives) and a target sum k, find the length of the longest contiguous subarray that sums to exactly k.

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  arr = [10,5,2,7,1,-10], k = 15
Output: 6
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

See [`012-Longest-Subarray-With-Sum-K.java`](./012-Longest-Subarray-With-Sum-K.java) in this folder — implement the `TODO` inside `LongestSubarrayWithSumK.longestSubarrayWithSumK(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
