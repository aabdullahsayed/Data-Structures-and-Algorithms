# 013. Next Greater Element

**Topic:** Stack
**Difficulty:** Medium
**Solution file:** [`013-Next-Greater-Element.java`](./013-Next-Greater-Element.java)

## Problem

Given an array, find the next greater element for every element — the first element to its right that is larger. Use -1 where none exists. Solve using a stack in O(n).

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  arr = [4,5,2,25]
Output: [5,25,25,-1]
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

See [`013-Next-Greater-Element.java`](./013-Next-Greater-Element.java) in this folder — implement the `TODO` inside `NextGreaterElement.nextGreaterElement(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
