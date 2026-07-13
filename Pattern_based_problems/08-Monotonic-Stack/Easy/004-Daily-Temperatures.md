# 004. Daily Temperatures

**Topic:** Monotonic Stack
**Difficulty:** Easy
**Solution file:** [`004-Daily-Temperatures.java`](./004-Daily-Temperatures.java)

## Problem

Given a list of daily temperatures, find for each day how many days you'd have to wait for a strictly warmer temperature (0 if there is none in the future).

## Technique Reminder

A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).

**Hint:** Pop elements that violate the monotonic property before pushing the new one.

## Example

```
Input:  temps = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Monotonic Stack** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`004-Daily-Temperatures.java`](./004-Daily-Temperatures.java) in this folder — implement the `TODO` inside `DailyTemperatures.dailyTemperatures(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
