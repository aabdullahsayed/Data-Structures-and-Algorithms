# 8. Encode and Decode Strings

**Difficulty:** Medium

**Pattern:** Length-prefixed encoding (delimiter framing)

## Key Idea
Since strings can contain any character, use a length prefix + special delimiter so decode always knows where one string ends and the next begins.

## Approach
1. Encode: for each string s, append str(len(s)) + '#' + s to the result.
2. Decode: scan the encoded string; read digits until '#' to get the length, then read exactly that many characters as the next original string.
3. Repeat until the whole encoded string is consumed.
4. This avoids ambiguity from using a plain separator like comma, which could appear inside a string.

## Complexity
Time: O(n) total characters | Space: O(n)

## Edge Cases
Strings containing digits, '#', or the delimiter character itself — length-prefix framing handles all of these safely.

## Related / Notes
Common in system design questions (e.g., TinyURL-style serialization) too.
