# 9. Longest Consecutive Sequence

**Difficulty:** Medium

**Pattern:** Hash Set + only start counting from sequence beginnings

## Key Idea
Put all numbers in a set; only start expanding a sequence from a number x when x-1 is NOT in the set (i.e., x is a sequence start), guaranteeing overall O(n).

## Approach
1. Add all nums to a hash set for O(1) membership checks.
2. For each num in the set, check if num-1 is in the set — if yes, skip (it's not a sequence start).
3. If num is a start, count upward: length = 1, while num+length in set, length += 1.
4. Track the max length seen across all starts.

## Complexity
Time: O(n) amortized (each number visited O(1) times total) | Space: O(n)

## Edge Cases
Empty array -> 0, duplicates in array (set removes them naturally), negative numbers fine.

## Related / Notes
Different from 'Longest Consecutive Subarray' — order in the input array does not matter here.
