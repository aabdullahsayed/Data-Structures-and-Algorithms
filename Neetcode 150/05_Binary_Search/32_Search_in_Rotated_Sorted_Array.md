# 32. Search in Rotated Sorted Array

**Difficulty:** Medium

**Pattern:** Modified Binary Search — identify which half is sorted, then decide

## Key Idea
At each step, at least one half (left..mid or mid..right) is guaranteed to be normally sorted; check if target lies in that sorted half's range to decide which way to go.

## Approach
1. Set left = 0, right = len(nums) - 1.
2. While left <= right: mid = (left+right)//2; if nums[mid] == target, return mid.
3. If nums[left] <= nums[mid] (left half is sorted): if nums[left] <= target < nums[mid], search left half (right = mid-1), else search right half (left = mid+1).
4. Else (right half is sorted): if nums[mid] < target <= nums[right], search right half (left = mid+1), else search left half (right = mid-1).
5. Return -1 if not found.

## Complexity
Time: O(log n) | Space: O(1)

## Edge Cases
No rotation, target equals a boundary element, target not present.

## Related / Notes
With duplicates allowed, worst case degrades to O(n) (LeetCode 81, not in core 150).
