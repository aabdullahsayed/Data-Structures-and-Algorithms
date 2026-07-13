# 008. Difference Array Basic

**Topic:** Prefix Sum
**Difficulty:** Easy
**Solution file:** [`008-Difference-Array-Basic.java`](./008-Difference-Array-Basic.java)

## Problem

Given an array, build a difference array (diff[0] = arr[0], diff[i] = arr[i] - arr[i-1]) and use it to reconstruct the original array from scratch.

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  arr = [2,4,4,6]
Output: diff = [2,2,0,2]
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

See [`008-Difference-Array-Basic.java`](./008-Difference-Array-Basic.java) in this folder — implement the `TODO` inside `DifferenceArrayBasic.differenceArrayBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
