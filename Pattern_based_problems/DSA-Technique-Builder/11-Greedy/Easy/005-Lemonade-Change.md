# 005. Lemonade Change

**Topic:** Greedy
**Difficulty:** Easy
**Solution file:** [`005-Lemonade-Change.java`](./005-Lemonade-Change.java)

## Problem

Customers line up to buy $5 lemonade, paying with a $5, $10, or $20 bill. Starting with no change, determine if you can provide correct change to every customer in order.

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  bills = [5,5,5,10,20]
Output: true
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Greedy** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`005-Lemonade-Change.java`](./005-Lemonade-Change.java) in this folder — implement the `TODO` inside `LemonadeChange.lemonadeChange(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
