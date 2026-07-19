# 16. Longest Substring Without Repeating Characters

**Difficulty:** Medium

**Pattern:** Sliding Window with a Hash Set/Map of last-seen index

## Key Idea
Expand the window by moving right; whenever a repeat is found, shrink from the left past the previous occurrence.

## Approach
1. Use a hash map char -> last index seen, and left = 0.
2. For right in range(len(s)): if s[right] in map and map[s[right]] >= left, move left = map[s[right]] + 1.
3. Update map[s[right]] = right.
4. Track max_len = max(max_len, right - left + 1) each iteration.

## Complexity
Time: O(n) | Space: O(min(n, charset size))

## Edge Cases
Empty string -> 0, all unique characters -> whole string length, all same character -> 1.

## Related / Notes
Template reused in Longest Repeating Character Replacement and Minimum Window Substring.
