/**
 * Longest Subarray With Sum K
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given an array of integers (may include negatives) and a target sum k, find the length of the
 * longest contiguous subarray that sums to exactly k.
 *
 * Example:
 * Input:  arr = [10,5,2,7,1,-10], k = 15
 * Output: 6
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class LongestSubarrayWithSumK {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int longestSubarrayWithSumK(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(LongestSubarrayWithSumK.longestSubarrayWithSumK(sample));
    }
}
