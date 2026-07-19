# 2. Valid Anagram

**Difficulty:** Easy

**Pattern:** Frequency Counting (Hash Map / Array of size 26)

## Key Idea
Two strings are anagrams iff they have identical character frequency counts.

## Approach
1. If lengths differ, return False right away.
2. Build a frequency map/array for string s.
3. Decrement counts while scanning string t.
4. If any count goes negative or map isn't all-zero at the end, return False.
5. Alt one-liner: sorted(s) == sorted(t) but that's O(n log n).

## Complexity
Time: O(n) with counting, O(n log n) with sorting | Space: O(1) (26 letters) or O(n) for unicode

## Edge Cases
Different lengths, empty strings, unicode characters (use dict instead of fixed array).

## Related / Notes
Group Anagrams uses the same frequency-signature idea.
