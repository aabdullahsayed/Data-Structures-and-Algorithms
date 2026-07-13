# 018. Allocate Books

**Topic:** Binary Search
**Difficulty:** Medium
**Solution file:** [`018-Allocate-Books.java`](./018-Allocate-Books.java)

## Problem

Given an array of book page counts and m students, allocate the books to students so that each student gets a contiguous set of books, and minimize the maximum number of pages assigned to any one student.

## Technique Reminder

Search a sorted space (array or answer range) by repeatedly halving it.

**Hint:** Define a clear predicate that is False...False,True...True (or vice versa) over the search space.

## Example

```
Input:  books = [12,34,67,90], m = 2
Output: 113
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Binary Search** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`018-Allocate-Books.java`](./018-Allocate-Books.java) in this folder — implement the `TODO` inside `AllocateBooks.allocateBooks(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
