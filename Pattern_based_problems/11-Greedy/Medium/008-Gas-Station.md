# 008. Gas Station

**Topic:** Greedy
**Difficulty:** Medium
**Solution file:** [`008-Gas-Station.java`](./008-Gas-Station.java)

## Problem

Given gas and cost arrays for a circular route of gas stations, find the starting station index from which a car can complete the entire circuit, or -1 if impossible.

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  gas=[1,2,3,4,5], cost=[3,4,5,1,2]
Output: 3
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

See [`008-Gas-Station.java`](./008-Gas-Station.java) in this folder — implement the `TODO` inside `GasStation.gasStation(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
