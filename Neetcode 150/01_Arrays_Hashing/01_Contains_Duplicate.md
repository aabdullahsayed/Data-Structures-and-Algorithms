# 1. Contains Duplicate

**Difficulty:** Easy

**Pattern:** Hash Set for O(1) lookups

## Key Idea
If any value appears twice, a set built from the array will be smaller than the array itself.

## Approach
1. Insert elements into a hash set one by one.
2. If an element is already in the set, return True immediately.
3. If you finish the loop, return False.
4. Alternative: compare len(set(nums)) != len(nums) in one line.

## Complexity
Time: O(n) | Space: O(n)

## Edge Cases
Empty array -> False. All unique -> False. All same -> True.

## Related / Notes
Good warm-up for hashing pattern used everywhere else in this section.
