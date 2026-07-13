/**
 * Longest Unique Substring
 * Topic: Sliding Window | Difficulty: Medium
 *
 * Problem:
 * Given a string, find the length of the longest substring without repeating characters
 * (optimized O(n) version using a hashmap of last-seen index).
 *
 * Example:
 * Input:  "pwwkew"
 * Output: 3   ("wke")
 *
 * Technique: Maintain a window [left, right] over the array/string and expand/shrink it based on a condition.
 * Hint: Decide what the window must track (sum, count, frequency map) and when to shrink it.
 */
public class LongestUniqueSubstring {

    /**
     * TODO: implement using Sliding Window.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int longestUniqueSubstring(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(LongestUniqueSubstring.longestUniqueSubstring(sample));
    }
}
