# 013. Count Subarrays With Sum K

**Topic:** Prefix Sum
**Difficulty:** Medium
**Solution file:** [`013-Count-Subarrays-With-Sum-K.java`](./013-Count-Subarrays-With-Sum-K.java)

## Problem

Given a binary array and an integer k, count the number of contiguous subarrays whose sum equals k (e.g. exactly k ones).

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  arr = [1,0,1,0,1], k = 2
Output: 4
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

See [`013-Count-Subarrays-With-Sum-K.java`](./013-Count-Subarrays-With-Sum-K.java) in this folder — implement the `TODO` inside `CountSubarraysWithSumK.countSubarraysWithSumK(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
