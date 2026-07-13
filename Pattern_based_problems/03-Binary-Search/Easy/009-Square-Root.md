# 009. Square Root

**Topic:** Binary Search
**Difficulty:** Easy
**Solution file:** [`009-Square-Root.java`](./009-Square-Root.java)

## Problem

Given a non-negative integer n, find floor(sqrt(n)) using binary search, without using any built-in sqrt function.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  n = 28
Output: 5
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

See [`009-Square-Root.java`](./009-Square-Root.java) in this folder — implement the `TODO` inside `SquareRoot.squareRoot(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
