# 009. Sort a Stack

**Topic:** Stack
**Difficulty:** Easy
**Solution file:** [`009-Sort-a-Stack.java`](./009-Sort-a-Stack.java)

## Problem

Given a stack of integers, sort it in ascending order (smallest on top) using only recursion — no extra array, only the recursion call stack as auxiliary storage.

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  stack (top->bottom) = [3,1,4,2]
Output: [1,2,3,4]  (top->bottom)
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

See [`009-Sort-a-Stack.java`](./009-Sort-a-Stack.java) in this folder — implement the `TODO` inside `SortAStack.sortAStack(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
