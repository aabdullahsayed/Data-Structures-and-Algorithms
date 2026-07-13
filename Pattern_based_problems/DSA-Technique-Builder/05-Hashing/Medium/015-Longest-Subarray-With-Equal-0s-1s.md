# 015. Longest Subarray With Equal 0s 1s

**Topic:** Hashing
**Difficulty:** Medium
**Solution file:** [`015-Longest-Subarray-With-Equal-0s-1s.java`](./015-Longest-Subarray-With-Equal-0s-1s.java)

## Problem

Given a binary array, find the length of the longest contiguous subarray that contains an equal number of 0s and 1s.

## Technique Reminder

Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops.

**Hint:** Ask: what do I need to remember about elements I've already seen?

## Example

```
Input:  arr = [0,1,0,1,1,1,0]
Output: 4
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

See [`015-Longest-Subarray-With-Equal-0s-1s.java`](./015-Longest-Subarray-With-Equal-0s-1s.java) in this folder — implement the `TODO` inside `LongestSubarrayWithEqual0s1s.longestSubarrayWithEqual0s1s(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
