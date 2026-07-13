# 019. Aggressive Cows

**Topic:** Binary Search
**Difficulty:** Medium
**Solution file:** [`019-Aggressive-Cows.java`](./019-Aggressive-Cows.java)

## Problem

Given the positions of stalls and c cows, place the cows into stalls (at most one per stall) to maximize the minimum distance between any two cows.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  stalls = [1,2,4,8,9], cows = 3
Output: 3
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

See [`019-Aggressive-Cows.java`](./019-Aggressive-Cows.java) in this folder — implement the `TODO` inside `AggressiveCows.aggressiveCows(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
