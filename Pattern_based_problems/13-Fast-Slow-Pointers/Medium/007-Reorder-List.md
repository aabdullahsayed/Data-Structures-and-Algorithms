# 007. Reorder List

**Topic:** Fast Slow Pointers
**Difficulty:** Medium
**Solution file:** [`007-Reorder-List.java`](./007-Reorder-List.java)

## Problem

Given a linked list L0 -> L1 -> ... -> Ln, reorder it in-place to L0 -> Ln -> L1 -> Ln-1 -> ..., by finding the middle with fast/slow pointers, reversing the second half, then merging the two halves.

## Technique Reminder

Two pointers moving at different speeds through a sequence/linked list — great for cycle detection.

**Hint:** slow moves 1 step, fast moves 2 steps. If there's a cycle, they eventually meet.

## Example

```
Input:  1->2->3->4
Output: 1->4->2->3
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

See [`007-Reorder-List.java`](./007-Reorder-List.java) in this folder — implement the `TODO` inside `ReorderList.reorderList(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
