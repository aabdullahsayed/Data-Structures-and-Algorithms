# 010. LRU Cache Basic

**Topic:** Queue
**Difficulty:** Medium
**Solution file:** [`010-LRU-Cache-Basic.java`](./010-LRU-Cache-Basic.java)

## Problem

Design a Least Recently Used (LRU) cache with a fixed capacity, supporting get(key) and put(key, value) in O(1) time each (hashmap + doubly linked list, or a queue-backed structure).

## Technique Reminder

FIFO structure, useful for order-preserving processing and BFS-style problems.

**Hint:** Ask what needs to be processed in the order it arrived.

## Example

```
Input:  capacity=2; put(1,1); put(2,2); get(1); put(3,3)
Output: get(1) -> 1; put(3,3) evicts key 2 (least recently used)
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

See [`010-LRU-Cache-Basic.java`](./010-LRU-Cache-Basic.java) in this folder — implement the `TODO` inside `LRUCacheBasic.lruCacheBasic(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
