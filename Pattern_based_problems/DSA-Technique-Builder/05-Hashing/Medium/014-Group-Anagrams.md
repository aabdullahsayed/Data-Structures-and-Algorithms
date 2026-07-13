# 014. Group Anagrams

**Topic:** Hashing
**Difficulty:** Medium
**Solution file:** [`014-Group-Anagrams.java`](./014-Group-Anagrams.java)

## Problem

Given an array of strings, group together the strings that are anagrams of each other.

## Technique Reminder

Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops.

**Hint:** Ask: what do I need to remember about elements I've already seen?

## Example

```
Input:  strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
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

See [`014-Group-Anagrams.java`](./014-Group-Anagrams.java) in this folder — implement the `TODO` inside `GroupAnagrams.groupAnagrams(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
