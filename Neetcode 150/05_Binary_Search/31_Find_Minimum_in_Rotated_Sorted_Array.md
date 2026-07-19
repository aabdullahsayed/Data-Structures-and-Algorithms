# 31. Find Minimum in Rotated Sorted Array

**Difficulty:** Medium

**Pattern:** Modified Binary Search using rotation point property

## Key Idea
Compare mid to the rightmost element: if nums[mid] > nums[right], the minimum lies to the right of mid; otherwise it's at mid or to its left.

## Approach
1. Set left = 0, right = len(nums) - 1.
2. While left < right: mid = (left+right)//2.
3. If nums[mid] > nums[right]: minimum is in (mid, right], so left = mid + 1.
4. Else: minimum is in [left, mid], so right = mid.
5. Loop ends when left == right — that index holds the minimum.

## Complexity
Time: O(log n) | Space: O(1)

## Edge Cases
No rotation at all (already sorted), single element, all elements identical (edge case needing linear fallback in duplicate variant).

## Related / Notes
Search in Rotated Sorted Array reuses this rotation-detection idea but also searches for a target value.
