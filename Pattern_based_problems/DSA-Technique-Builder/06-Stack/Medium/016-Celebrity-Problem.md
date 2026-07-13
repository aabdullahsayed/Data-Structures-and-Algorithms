# 016. Celebrity Problem

**Topic:** Stack
**Difficulty:** Medium
**Solution file:** [`016-Celebrity-Problem.java`](./016-Celebrity-Problem.java)

## Problem

In a party of n people, a celebrity is someone whom everyone knows but who knows no one. Given a knows(a,b) matrix, find the celebrity's index in O(n) using a stack, or return -1 if there is none.

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  a 3x3 knows-matrix where person 2 is known by all and knows nobody
Output: 2
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

See [`016-Celebrity-Problem.java`](./016-Celebrity-Problem.java) in this folder — implement the `TODO` inside `CelebrityProblem.celebrityProblem(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
