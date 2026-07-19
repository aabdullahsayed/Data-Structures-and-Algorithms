# 28. Binary Search

**Difficulty:** Easy

**Pattern:** Classic Binary Search on a sorted array

## Key Idea
Repeatedly halve the search space by comparing the middle element to the target.

## Approach
1. Set left = 0, right = len(nums) - 1.
2. While left <= right: mid = left + (right - left) // 2.
3. If nums[mid] == target, return mid.
4. If nums[mid] < target, left = mid + 1; else right = mid - 1.
5. Return -1 if the loop ends without finding target.

## Complexity
Time: O(log n) | Space: O(1)

## Edge Cases
Empty array, target smaller than all / larger than all elements, single-element array.

## Related / Notes
Base template for every other binary search problem — memorize the mid/compare/shrink pattern.
