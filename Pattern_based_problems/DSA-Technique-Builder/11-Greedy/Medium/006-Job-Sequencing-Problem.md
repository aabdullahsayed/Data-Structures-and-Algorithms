# 006. Job Sequencing Problem

**Topic:** Greedy
**Difficulty:** Medium
**Solution file:** [`006-Job-Sequencing-Problem.java`](./006-Job-Sequencing-Problem.java)

## Problem

Given jobs with deadlines and profits (each job takes exactly 1 unit of time, at most one job may run per time slot), schedule jobs to maximize total profit while respecting deadlines.

## Technique Reminder

Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.

**Hint:** Sort by some criterion first, then make one pass making the best local choice.

## Example

```
Input:  jobs=(id,deadline,profit): (a,4,20),(b,1,10),(c,1,40),(d,1,30)
Output: 2 jobs scheduled, total profit 60
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

See [`006-Job-Sequencing-Problem.java`](./006-Job-Sequencing-Problem.java) in this folder — implement the `TODO` inside `JobSequencingProblem.jobSequencingProblem(...)`
and add your own test cases in `main`.

## Complexity Goal

- Time: O(?)
- Space: O(?)

## Status

- [ ] Solved
- [ ] Optimized
- [ ] Explained out loud / written notes
