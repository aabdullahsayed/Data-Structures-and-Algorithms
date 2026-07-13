/**
 * Range Sum Query
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, preprocess it with a prefix-sum array so that any range-sum query (sum of
 * elements from index l to r) can be answered in O(1).
 *
 * Example:
 * Input:  arr = [1,2,3,4,5], query(l=1, r=3)
 * Output: 9
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class RangeSumQuery {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int rangeSumQuery(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(RangeSumQuery.rangeSumQuery(sample));
    }
}
