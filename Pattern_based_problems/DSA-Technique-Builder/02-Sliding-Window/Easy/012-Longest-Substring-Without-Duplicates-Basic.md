# 012. Longest Substring Without Duplicates Basic

**Topic:** Sliding Window
**Difficulty:** Easy
**Solution file:** [`012-Longest-Substring-Without-Duplicates-Basic.java`](./012-Longest-Substring-Without-Duplicates-Basic.java)

## Problem

Given a string, find the length of the longest substring that has no repeating characters.

## Technique Reminder

Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.

**Hint:** Decide what the window must track (sum, count, frequency map) and when to shrink it.

## Example

```
Input:  "abcabcbb"
Output: 3   ("abc")
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

See [`012-Longest-Substring-Without-Duplicates-Basic.java`](./012-Longest-Substring-Without-Duplicates-Basic.java) in this folder — implement the `TODO` inside `LongestSubstringWithoutDuplicatesBasic.longestSubstringWithoutDuplicatesBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
