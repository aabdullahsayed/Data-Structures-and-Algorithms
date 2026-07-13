# 002. Valid Parentheses

**Topic:** Stack
**Difficulty:** Easy
**Solution file:** [`002-Valid-Parentheses.java`](./002-Valid-Parentheses.java)

## Problem

Given a string containing just the characters '(){}[]'.  determine if the brackets are properly matched and nested.

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  "()[]{}"
Output: true
Input:  "(]"
Output: false
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

See [`002-Valid-Parentheses.java`](./002-Valid-Parentheses.java) in this folder — implement the `TODO` inside `ValidParentheses.validParentheses(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
