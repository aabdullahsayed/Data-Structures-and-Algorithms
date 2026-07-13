# 020. Asteroid Collision

**Topic:** Stack
**Difficulty:** Medium
**Solution file:** [`020-Asteroid-Collision.java`](./020-Asteroid-Collision.java)

## Problem

Given an array of integers representing asteroids (sign gives direction, magnitude gives size), simulate collisions using a stack and return the state of the asteroids after all collisions resolve.

## Technique Reminder

LIFO structure, useful for matching, backtracking state, and expression evaluation.

**Hint:** Ask what needs to be 'undone' or matched in reverse order.

## Example

```
Input:  asteroids = [5,10,-5]
Output: [5,10]
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

See [`020-Asteroid-Collision.java`](./020-Asteroid-Collision.java) in this folder — implement the `TODO` inside `AsteroidCollision.asteroidCollision(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
