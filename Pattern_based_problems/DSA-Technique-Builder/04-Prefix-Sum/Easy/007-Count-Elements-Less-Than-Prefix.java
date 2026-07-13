/**
 * Count Elements Less Than Prefix
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, for each index i, count how many elements before index i are strictly less than
 * arr[i], using a running frequency/prefix count structure.
 *
 * Example:
 * Input:  arr = [1,3,2,4]
 * Output: [0,1,1,3]
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class CountElementsLessThanPrefix {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int countElementsLessThanPrefix(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(CountElementsLessThanPrefix.countElementsLessThanPrefix(sample));
    }
}
