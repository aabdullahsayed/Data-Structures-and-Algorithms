# 14. Trapping Rain Water

**Difficulty:** Hard

**Pattern:** Two Pointers with running left-max/right-max (or prefix arrays)

## Key Idea
Water trapped at index i equals min(max height to its left, max height to its right) minus height[i]; track running maxes from both ends to avoid precomputing full arrays.

## Approach
1. Set left = 0, right = n-1, leftMax = 0, rightMax = 0, result = 0.
2. While left < right: if height[left] <= height[right]: leftMax = max(leftMax, height[left]); result += leftMax - height[left]; left += 1.
3. Else: rightMax = max(rightMax, height[right]); result += rightMax - height[right]; right -= 1.
4. Return result. (Alt approach: precompute leftMax[] and rightMax[] arrays, O(n) space.)

## Complexity
Time: O(n) | Space: O(1) with two pointers, O(n) with prefix arrays

## Edge Cases
Flat terrain -> 0 trapped, strictly increasing or decreasing terrain -> 0 trapped.

## Related / Notes
Builds directly on Container With Most Water's two-pointer instinct but different invariant (max-so-far, not width*min-height).
