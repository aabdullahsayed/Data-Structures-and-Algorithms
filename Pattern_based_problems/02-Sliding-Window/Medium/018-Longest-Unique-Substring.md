# 018. Longest Unique Substring

**Topic:** Sliding Window
**Difficulty:** Medium
**Solution file:** [`018-Longest-Unique-Substring.java`](./018-Longest-Unique-Substring.java)

## Problem

Given a string, find the length of the longest substring without repeating characters (optimized O(n) version using a hashmap of last-seen index).

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  "pwwkew"
Output: 3   ("wke")
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Sliding Window** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`018-Longest-Unique-Substring.java`](./018-Longest-Unique-Substring.java) in this folder — implement the `TODO` inside `LongestUniqueSubstring.longestUniqueSubstring(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
