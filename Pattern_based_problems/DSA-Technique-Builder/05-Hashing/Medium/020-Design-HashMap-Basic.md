# 020. Design HashMap Basic

**Topic:** Hashing
**Difficulty:** Medium
**Solution file:** [`020-Design-HashMap-Basic.java`](./020-Design-HashMap-Basic.java)

## Problem

Design and implement a simplified HashMap from scratch — supporting put(key, value), get(key), and remove(key) — without using any built-in map/dictionary type.

## Technique Reminder

Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops.

**Hint:** Ask: what do I need to remember about elements I've already seen?

## Example

```
Input:  put(1,10); get(1); remove(1); get(1)
Output: 10, then -1
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Hashing** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`020-Design-HashMap-Basic.java`](./020-Design-HashMap-Basic.java) in this folder — implement the `TODO` inside `DesignHashMapBasic.designHashmapBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
