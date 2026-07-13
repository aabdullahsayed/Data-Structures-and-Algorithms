# 003. First Occurrence

**Topic:** Binary Search
**Difficulty:** Easy
**Solution file:** [`003-First-Occurrence.java`](./003-First-Occurrence.java)

## Problem

Given a sorted array that may contain duplicates, find the index of the first occurrence of a target value.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  arr = [1,2,2,2,3,4], target = 2
Output: 1
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

See [`003-First-Occurrence.java`](./003-First-Occurrence.java) in this folder — implement the `TODO` inside `FirstOccurrence.firstOccurrence(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
