# 019. Simplify Path

**Topic:** Stack
**Difficulty:** Medium
**Solution file:** [`019-Simplify-Path.java`](./019-Simplify-Path.java)

## Problem

Given an absolute Unix-style file path, simplify it — resolving '.', '..', and redundant slashes — using a stack of directory names.

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  "/a/./b/../../c/"
Output: "/c"
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Stack** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`019-Simplify-Path.java`](./019-Simplify-Path.java) in this folder — implement the `TODO` inside `SimplifyPath.simplifyPath(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
