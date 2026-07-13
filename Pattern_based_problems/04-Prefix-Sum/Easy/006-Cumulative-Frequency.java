/**
 * Cumulative Frequency
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given a list of numbers within a known small range, build a frequency array and then a prefix
 * sum over it so you can quickly answer 'how many numbers seen are <= x'.
 *
 * Example:
 * Input:  arr = [2,3,2,1,1] (values 1..3)
 * Output: freq=[2,2,1], cumulative=[2,4,5]
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class CumulativeFrequency {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int cumulativeFrequency(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(CumulativeFrequency.cumulativeFrequency(sample));
    }
}
