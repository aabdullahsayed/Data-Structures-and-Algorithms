# 010. Jump Game

**Topic:** Greedy
**Difficulty:** Medium
**Solution file:** [`010-Jump-Game.java`](./010-Jump-Game.java)

## Problem

Given an array where each element is the maximum jump length from that position, determine whether you can reach the last index starting from the first.

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  arr = [2,3,1,1,4]
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

See [`010-Jump-Game.java`](./010-Jump-Game.java) in this folder — implement the `TODO` inside `JumpGame.jumpGame(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
