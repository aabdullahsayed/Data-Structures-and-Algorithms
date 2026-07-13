# 015. Stock Span Problem

**Topic:** Stack
**Difficulty:** Medium
**Solution file:** [`015-Stock-Span-Problem.java`](./015-Stock-Span-Problem.java)

## Problem

Given daily stock prices, compute the 'span' of the stock's price for each day: the number of consecutive days ending today (including today) during which the price was less than or equal to today's price.

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  prices = [100,80,60,70,60,75,85]
Output: [1,1,1,2,1,4,6]
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

See [`015-Stock-Span-Problem.java`](./015-Stock-Span-Problem.java) in this folder — implement the `TODO` inside `StockSpanProblem.stockSpanProblem(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
