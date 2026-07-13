/**
 * Subarray Sum Equals K
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given an array of integers and a target sum k, find the total number of contiguous subarrays
 * whose sum equals k.
 *
 * Example:
 * Input:  arr = [1,1,1], k = 2
 * Output: 2
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class SubarraySumEqualsK {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int subarraySumEqualsK(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(SubarraySumEqualsK.subarraySumEqualsK(sample));
    }
}
