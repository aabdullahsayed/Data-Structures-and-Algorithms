/**
 * Continuous Subarray Sum Multiple K
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given an array of integers and an integer k, determine whether the array has a contiguous
 * subarray of size at least 2 whose sum is a multiple of k.
 *
 * Example:
 * Input:  arr = [23,2,4,6,7], k = 6
 * Output: true   ([2,4])
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class ContinuousSubarraySumMultipleK {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int continuousSubarraySumMultipleK(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(ContinuousSubarraySumMultipleK.continuousSubarraySumMultipleK(sample));
    }
}
