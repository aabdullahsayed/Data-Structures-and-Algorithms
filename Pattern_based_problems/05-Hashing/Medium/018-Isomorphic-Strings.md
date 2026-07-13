# 018. Isomorphic Strings

**Topic:** Hashing
**Difficulty:** Medium
**Solution file:** [`018-Isomorphic-Strings.java`](./018-Isomorphic-Strings.java)

## Problem

Given two strings s and t, determine whether they are isomorphic: characters in s can be replaced to get t, using a consistent, one-to-one character mapping both ways.

## Technique Reminder

Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops.

**Hint:** Ask: what do I need to remember about elements I've already seen?

## Example

```
Input:  s = "egg", t = "add"
Output: true
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

See [`018-Isomorphic-Strings.java`](./018-Isomorphic-Strings.java) in this folder — implement the `TODO` inside `IsomorphicStrings.isomorphicStrings(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
