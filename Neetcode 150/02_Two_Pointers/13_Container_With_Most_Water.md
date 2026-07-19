# 13. Container With Most Water

**Difficulty:** Medium

**Pattern:** Two Pointers, always move the shorter wall inward

## Key Idea
Water held is limited by the shorter of the two walls; moving the taller wall inward can only decrease or keep width down without helping height, so always move the shorter one.

## Approach
1. Set left = 0, right = n-1, max_area = 0.
2. While left < right: area = min(height[left], height[right]) * (right - left); update max_area.
3. If height[left] < height[right], left += 1; else right -= 1.
4. Return max_area once pointers meet.

## Complexity
Time: O(n) | Space: O(1)

## Edge Cases
All equal heights, strictly increasing/decreasing heights.

## Related / Notes
Trapping Rain Water is the natural harder follow-up (different objective: total trapped volume, not max single container).
