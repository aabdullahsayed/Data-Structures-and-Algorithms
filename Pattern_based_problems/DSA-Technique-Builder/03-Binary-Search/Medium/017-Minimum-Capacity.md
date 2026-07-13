# 017. Minimum Capacity

**Topic:** Binary Search
**Difficulty:** Medium
**Solution file:** [`017-Minimum-Capacity.java`](./017-Minimum-Capacity.java)

## Problem

Given the weights of packages to be shipped within D days (packages must be shipped in the given order, each day's load must not exceed capacity), find the minimum ship capacity that makes this possible.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  weights = [1,2,3,4,5,6,7,8,9,10], D = 5
Output: 15
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

See [`017-Minimum-Capacity.java`](./017-Minimum-Capacity.java) in this folder — implement the `TODO` inside `MinimumCapacity.minimumCapacity(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
