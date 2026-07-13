# 012. Decimal to Binary Using Stack

**Topic:** Stack
**Difficulty:** Easy
**Solution file:** [`012-Decimal-to-Binary-Using-Stack.java`](./012-Decimal-to-Binary-Using-Stack.java)

## Problem

Given a decimal (base-10) non-negative integer, convert it to its binary string representation using a stack (push remainders, pop to build the result).

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  n = 233
Output: "11101001"
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

See [`012-Decimal-to-Binary-Using-Stack.java`](./012-Decimal-to-Binary-Using-Stack.java) in this folder — implement the `TODO` inside `DecimalToBinaryUsingStack.decimalToBinaryUsingStack(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
