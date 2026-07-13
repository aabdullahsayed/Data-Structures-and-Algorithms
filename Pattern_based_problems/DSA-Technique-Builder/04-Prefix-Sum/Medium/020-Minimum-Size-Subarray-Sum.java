/**
 * Minimum Size Subarray Sum
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given an array of positive integers and a target sum, find the minimal length of a contiguous
 * subarray whose sum is >= target. Return 0 if no such subarray exists.
 *
 * Example:
 * Input:  arr = [2,3,1,2,4,3], target = 7
 * Output: 2
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class MinimumSizeSubarraySum {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int minimumSizeSubarraySum(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(MinimumSizeSubarraySum.minimumSizeSubarraySum(sample));
    }
}
