/**
 * Count Pairs With Given Sum
 * Topic: Two Pointers | Difficulty: Easy
 *
 * Problem:
 * Given a sorted array, count how many pairs (i, j) with i < j have arr[i] + arr[j] equal to a
 * given target sum.
 *
 * Example:
 * Input:  arr = [1, 2, 3, 4, 5], target = 6
 * Output: 2   (pairs: (1,5), (2,4))
 *
 * Technique: Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops.
 * Hint: Think about what invariant lets you move `left` or `right` without missing a valid answer.
 */
public class CountPairsWithGivenSum {

    /**
     * TODO: implement using Two Pointers.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int countPairsWithGivenSum(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(CountPairsWithGivenSum.countPairsWithGivenSum(sample));
    }
}
