# 011. Circular Tour Gas Station

**Topic:** Queue
**Difficulty:** Medium
**Solution file:** [`011-Circular-Tour-Gas-Station.java`](./011-Circular-Tour-Gas-Station.java)

## Problem

Given gas and cost arrays for a circular route of stations, find the starting station index from which a car (starting with an empty tank) can complete the full circuit once, or -1 if no such start exists.

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

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
2. Identify why the **Queue** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`011-Circular-Tour-Gas-Station.java`](./011-Circular-Tour-Gas-Station.java) in this folder — implement the `TODO` inside `CircularTourGasStation.circularTourGasStation(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
