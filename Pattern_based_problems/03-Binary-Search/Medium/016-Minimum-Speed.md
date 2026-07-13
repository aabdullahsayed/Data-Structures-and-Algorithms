# 016. Minimum Speed

**Topic:** Binary Search
**Difficulty:** Medium
**Solution file:** [`016-Minimum-Speed.java`](./016-Minimum-Speed.java)

## Problem

Koko loves bananas. Given piles of bananas and h hours, find the minimum integer eating speed k (bananas/hour) such that Koko can eat all the bananas within h hours (she eats from one pile per hour and can't switch piles mid-hour).

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  piles = [30,11,23,4,20], h = 5
Output: 30
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

See [`016-Minimum-Speed.java`](./016-Minimum-Speed.java) in this folder — implement the `TODO` inside `MinimumSpeed.minimumSpeed(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
