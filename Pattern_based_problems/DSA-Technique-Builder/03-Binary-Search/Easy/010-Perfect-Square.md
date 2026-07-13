# 010. Perfect Square

**Topic:** Binary Search
**Difficulty:** Easy
**Solution file:** [`010-Perfect-Square.java`](./010-Perfect-Square.java)

## Problem

Given a positive integer n, determine whether it is a perfect square, using binary search.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  n = 16
Output: true
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

See [`010-Perfect-Square.java`](./010-Perfect-Square.java) in this folder — implement the `TODO` inside `PerfectSquare.perfectSquare(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
