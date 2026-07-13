# 016. Range Update Queries

**Topic:** Prefix Sum
**Difficulty:** Medium
**Solution file:** [`016-Range-Update-Queries.java`](./016-Range-Update-Queries.java)

## Problem

Given an array (initially all zeros) and a list of range-update operations (add value v to every element from index l to r), compute the final array efficiently using a difference array.

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  size = 5, updates = [(0,1,10), (1,3,20)]
Output: [10,30,30,20,0]
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

See [`016-Range-Update-Queries.java`](./016-Range-Update-Queries.java) in this folder — implement the `TODO` inside `RangeUpdateQueries.rangeUpdateQueries(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
