# 10. Valid Palindrome

**Difficulty:** Easy

**Pattern:** Two Pointers converging from both ends

## Key Idea
Skip non-alphanumeric characters and compare lowercase characters from both ends moving inward.

## Approach
1. Set left = 0, right = len(s) - 1.
2. While left < right: skip left forward if s[left] isn't alphanumeric; skip right backward if s[right] isn't alphanumeric.
3. Compare s[left].lower() == s[right].lower(); if not equal return False.
4. Move both pointers inward and repeat; return True if loop completes.

## Complexity
Time: O(n) | Space: O(1)

## Edge Cases
Empty string / all-symbols string -> True, mixed case letters.

## Related / Notes
Palindrome variants: 'Valid Palindrome II' allows deleting one character.
