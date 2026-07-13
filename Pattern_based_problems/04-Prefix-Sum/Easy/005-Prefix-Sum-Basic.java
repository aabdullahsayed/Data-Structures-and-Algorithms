/**
 * Prefix Sum Basic
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, build its prefix-sum array where prefix[i] = arr[0] + arr[1] + ... + arr[i].
 *
 * Example:
 * Input:  arr = [3,1,2,5]
 * Output: [3,4,6,11]
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class PrefixSumBasic {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int prefixSumBasic(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(PrefixSumBasic.prefixSumBasic(sample));
    }
}
