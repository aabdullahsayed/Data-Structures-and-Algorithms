# 3. Two Sum

**Difficulty:** Easy

**Pattern:** Hash Map storing value -> index (complement lookup)

## Key Idea
For each number, check if (target - number) was already seen; if so you found the pair.

## Approach
1. Create an empty hash map.
2. Iterate through nums with index i.
3. Compute complement = target - nums[i].
4. If complement is already in the map, return [map[complement], i].
5. Otherwise store nums[i] -> i in the map and continue.

## Complexity
Time: O(n) | Space: O(n)

## Edge Cases
Exactly one solution is guaranteed per problem statement; duplicates in array are fine since we check before inserting.

## Related / Notes
Two Sum II (sorted array, two-pointer variant), 3Sum builds on this idea.
