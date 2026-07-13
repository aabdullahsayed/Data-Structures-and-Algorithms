# 010. Is Palindrome

**Topic:** Two Pointers
**Difficulty:** Easy
**Solution file:** [`010-Is-Palindrome.java`](./010-Is-Palindrome.java)

## Problem

Given a string, determine whether it reads the same forwards and backwards, using two pointers moving inward from both ends.

## Technique Reminder

Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.

**Hint:** Think about what invariant lets you move `left` or `right` without missing a valid answer.

## Example

```
Input:  "racecar"
Output: true
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Two Pointers** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`010-Is-Palindrome.java`](./010-Is-Palindrome.java) in this folder — implement the `TODO` inside `IsPalindrome.isPalindrome(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
