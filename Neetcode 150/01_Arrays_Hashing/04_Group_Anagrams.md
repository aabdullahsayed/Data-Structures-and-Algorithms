# 4. Group Anagrams

**Difficulty:** Medium

**Pattern:** Hash Map keyed by a canonical signature

## Key Idea
Anagrams share the same sorted string or the same 26-length character count tuple, so that becomes the map key.

## Approach
1. Create a hash map: key -> list of words.
2. For each word, compute a key: either sorted(word) or a tuple of 26 letter counts (faster, avoids O(k log k)).
3. Append the word to map[key].
4. Return map.values() as the list of groups.

## Complexity
Time: O(n*k) with counting key (k = avg word length), O(n*k log k) with sorted key | Space: O(n*k)

## Edge Cases
Empty string input, words with repeated letters, case sensitivity if relevant.

## Related / Notes
Valid Anagram is the 2-string special case of this.
