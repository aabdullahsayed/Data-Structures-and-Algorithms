/**
 * Subarray With Zero Sum
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given an array of integers, determine whether there exists a contiguous subarray whose sum is
 * zero.
 *
 * Example:
 * Input:  arr = [4,2,-3,1,6]
 * Output: true   ([2,-3,1])
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class SubarrayWithZeroSum {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int subarrayWithZeroSum(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(SubarrayWithZeroSum.subarrayWithZeroSum(sample));
    }
}
