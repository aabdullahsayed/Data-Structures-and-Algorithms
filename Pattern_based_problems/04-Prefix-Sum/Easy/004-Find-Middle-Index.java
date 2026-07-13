/**
 * Find Middle Index
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, find the leftmost index where the sum of all elements to the left equals the
 * sum of all elements to the right (LeetCode calls this the 'pivot index').
 *
 * Example:
 * Input:  arr = [1,7,3,6,5,6]
 * Output: 3
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class FindMiddleIndex {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int findMiddleIndex(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(FindMiddleIndex.findMiddleIndex(sample));
    }
}
