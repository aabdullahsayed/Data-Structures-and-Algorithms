/**
 * Range Update Queries
 * Topic: Prefix Sum | Difficulty: Medium
 *
 * Problem:
 * Given an array (initially all zeros) and a list of range-update operations (add value v to
 * every element from index l to r), compute the final array efficiently using a difference array.
 *
 * Example:
 * Input:  size = 5, updates = [(0,1,10), (1,3,20)]
 * Output: [10,30,30,20,0]
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class RangeUpdateQueries {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int rangeUpdateQueries(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(RangeUpdateQueries.rangeUpdateQueries(sample));
    }
}
