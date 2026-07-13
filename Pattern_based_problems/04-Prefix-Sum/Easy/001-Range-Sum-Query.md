# 001. Range Sum Query

**Topic:** Prefix Sum
**Difficulty:** Easy
**Solution file:** [`001-Range-Sum-Query.java`](./001-Range-Sum-Query.java)

## Problem

Given an array, preprocess it with a prefix-sum array so that any range-sum query (sum of elements from index l to r) can be answered in O(1).

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  arr = [1,2,3,4,5], query(l=1, r=3)
Output: 9
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

See [`001-Range-Sum-Query.java`](./001-Range-Sum-Query.java) in this folder — implement the `TODO` inside `RangeSumQuery.rangeSumQuery(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
