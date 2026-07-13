# 006. Insert At Bottom

**Topic:** Stack
**Difficulty:** Easy
**Solution file:** [`006-Insert-At-Bottom.java`](./006-Insert-At-Bottom.java)

## Problem

Given a stack and a value, insert the value at the very bottom of the stack using only recursion (no auxiliary stack or array).

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  stack (top->bottom) = [3,2,1], value = 10
Output: [3,2,1,10]
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

See [`006-Insert-At-Bottom.java`](./006-Insert-At-Bottom.java) in this folder — implement the `TODO` inside `InsertAtBottom.insertAtBottom(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
