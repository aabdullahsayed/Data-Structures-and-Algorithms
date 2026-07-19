# 18. Permutation in String

**Difficulty:** Medium

**Pattern:** Fixed-size Sliding Window + frequency array comparison

## Key Idea
A permutation of s1 exists in s2 iff some window of length len(s1) in s2 has the exact same character frequency as s1.

## Approach
1. Build freq array for s1 (26 ints) and for the first window of s2 of the same length.
2. Slide the window one character at a time: add the new right character's count, remove the character leaving on the left.
3. After each slide, compare the two frequency arrays (or keep a 'matches' counter to avoid O(26) comparisons each step).
4. If they match at any point, return True; if loop finishes, return False.

## Complexity
Time: O(n) with matches-counter optimization, O(26n) with naive comparison | Space: O(1)

## Edge Cases
len(s1) > len(s2) -> return False immediately.

## Related / Notes
Nearly identical skeleton to Find All Anagrams in a String (not in core 150 but very related).
