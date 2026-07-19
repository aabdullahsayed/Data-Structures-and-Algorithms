# 11. Two Sum II - Input Array Is Sorted

**Difficulty:** Medium

**Pattern:** Two Pointers exploiting sorted order

## Key Idea
In a sorted array, moving the left pointer right increases the sum, moving the right pointer left decreases it — so you can binary-search the pair in linear time.

## Approach
1. Set left = 0, right = len(numbers) - 1.
2. While left < right: compute sum = numbers[left] + numbers[right].
3. If sum == target, return [left+1, right+1] (1-indexed).
4. If sum < target, move left += 1 (need bigger sum); if sum > target, move right -= 1.

## Complexity
Time: O(n) | Space: O(1)

## Edge Cases
Exactly one solution guaranteed; array is 1-indexed in output.

## Related / Notes
Contrast with hash-map Two Sum — here sortedness lets us drop the extra space.
