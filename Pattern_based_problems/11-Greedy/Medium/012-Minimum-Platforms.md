# 012. Minimum Platforms

**Topic:** Greedy
**Difficulty:** Medium
**Solution file:** [`012-Minimum-Platforms.java`](./012-Minimum-Platforms.java)

## Problem

Given arrival and departure times of trains at a railway station, find the minimum number of platforms needed so that no train has to wait.

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  arrival=[900,940,950,1100,1500,1800], departure=[910,1200,1120,1130,1900,2000]
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

See [`012-Minimum-Platforms.java`](./012-Minimum-Platforms.java) in this folder — implement the `TODO` inside `MinimumPlatforms.minimumPlatforms(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
