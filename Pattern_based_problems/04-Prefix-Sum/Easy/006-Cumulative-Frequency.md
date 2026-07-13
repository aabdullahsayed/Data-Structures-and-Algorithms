# 006. Cumulative Frequency

**Topic:** Prefix Sum
**Difficulty:** Easy
**Solution file:** [`006-Cumulative-Frequency.java`](./006-Cumulative-Frequency.java)

## Problem

Given a list of numbers within a known small range, build a frequency array and then a prefix sum over it so you can quickly answer 'how many numbers seen are <= x'.

## Technique Reminder

Precompute cumulative sums so range-sum queries become O(1).

**Hint:** prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].

## Example

```
Input:  arr = [2,3,2,1,1] (values 1..3)
Output: freq=[2,2,1], cumulative=[2,4,5]
```

## Constraints (typical range — adjust to the exact source problem if it differs)

- 1 <= n <= 10^5
- Values fit in standard 32-bit integer range

## Approach Notes

1. Restate the problem in your own words.
2. Identify why the **Prefix Sum** pattern applies here.
3. Work out a time & space complexity target before coding (usually O(n) or O(n log n)).
4. Code the brute-force approach first if unsure, then optimize using the pattern.

## Starter Code

See [`006-Cumulative-Frequency.java`](./006-Cumulative-Frequency.java) in this folder — implement the `TODO` inside `CumulativeFrequency.cumulativeFrequency(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
