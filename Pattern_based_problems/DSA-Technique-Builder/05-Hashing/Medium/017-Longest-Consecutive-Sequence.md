# 017. Longest Consecutive Sequence

**Topic:** Hashing
**Difficulty:** Medium
**Solution file:** [`017-Longest-Consecutive-Sequence.java`](./017-Longest-Consecutive-Sequence.java)

## Problem

Given an unsorted array, find the length of the longest consecutive-elements sequence, in O(n) time using a hash set (no sorting allowed).

## Technique Reminder

Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops.

**Hint:** Ask: what do I need to remember about elements I've already seen?

## Example

```
Input:  arr = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Hashing** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`017-Longest-Consecutive-Sequence.java`](./017-Longest-Consecutive-Sequence.java) in this folder — implement the `TODO` inside `LongestConsecutiveSequence.longestConsecutiveSequence(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
