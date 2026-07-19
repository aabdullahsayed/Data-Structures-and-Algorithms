# 17. Longest Repeating Character Replacement

**Difficulty:** Medium

**Pattern:** Sliding Window + frequency count, window valid if (window length - max freq char count) <= k

## Key Idea
A window is achievable with at most k replacements if all but the most frequent character can be swapped, i.e. windowSize - maxFreq <= k.

## Approach
1. Use array/map count[26] for letters in window, left = 0, maxFreq = 0, result = 0.
2. For right in range(len(s)): increment count[s[right]]; maxFreq = max(maxFreq, count[s[right]]).
3. While (right - left + 1) - maxFreq > k: decrement count[s[left]], left += 1.
4. Update result = max(result, right - left + 1).

## Complexity
Time: O(n) (26 * n worst case for maxFreq recompute, but amortizes to O(n)) | Space: O(1) (26 letters)

## Edge Cases
maxFreq is allowed to be 'stale' (never decreases) — window only grows in valid net size, correctness still holds.

## Related / Notes
Compare with Permutation in String — both use fixed-size alphabet counting windows.
