# 002. Find Middle of Linked List

**Topic:** Fast Slow Pointers
**Difficulty:** Easy
**Solution file:** [`002-Find-Middle-of-Linked-List.java`](./002-Find-Middle-of-Linked-List.java)

## Problem

Given the head of a linked list, find its middle node in a single pass using a fast pointer (moves 2 steps) and a slow pointer (moves 1 step).

## Technique Reminder

Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.

**Hint:** slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.

## Example

```
Input:  1->2->3->4->5
Output: node with value 3
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Fast Slow Pointers** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`002-Find-Middle-of-Linked-List.java`](./002-Find-Middle-of-Linked-List.java) in this folder — implement the `TODO` inside `FindMiddleOfLinkedList.findMiddleOfLinkedList(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
