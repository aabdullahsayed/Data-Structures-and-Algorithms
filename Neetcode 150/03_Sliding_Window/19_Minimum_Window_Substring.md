# 19. Minimum Window Substring

**Difficulty:** Hard

**Pattern:** Sliding Window with need/have counters

## Key Idea
Expand right until the window contains all characters of t (with correct multiplicities), then greedily shrink left while it's still valid, recording the smallest valid window.

## Approach
1. Build a need map: char -> required count from t. Track 'required' = number of distinct chars needed.
2. Expand right pointer over s, updating a 'window' count map; when a char's window count first matches its need count, increment 'formed'.
3. While formed == required (window is valid): update best answer if smaller; then shrink from left, decrementing counts and 'formed' if a needed char drops below requirement, and move left forward.
4. Continue expanding right until s is exhausted; return the smallest recorded window (or empty string if none found).

## Complexity
Time: O(|s| + |t|) | Space: O(|s| + |t|) for the count maps

## Edge Cases
t longer than s -> impossible, duplicate characters in t (must match multiplicity, not just presence).

## Related / Notes
The hardest sliding-window template in the list — master this and the rest feel easier.
