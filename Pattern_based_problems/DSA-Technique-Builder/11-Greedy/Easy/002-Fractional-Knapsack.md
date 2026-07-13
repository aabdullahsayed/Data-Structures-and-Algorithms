# 002. Fractional Knapsack

**Topic:** Greedy
**Difficulty:** Easy
**Solution file:** [`002-Fractional-Knapsack.java`](./002-Fractional-Knapsack.java)

## Problem

Given the weights and values of items and a knapsack capacity, maximize the total value where items may be broken into fractions (unlike 0/1 knapsack).

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  items=(weight,value): (10,60),(20,100),(30,120); capacity=50
Output: 240.0
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

See [`002-Fractional-Knapsack.java`](./002-Fractional-Knapsack.java) in this folder — implement the `TODO` inside `FractionalKnapsack.fractionalKnapsack(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
