/**
 * Running Sum of Array
 * Topic: Prefix Sum | Difficulty: Easy
 *
 * Problem:
 * Given an array, return a new array where each element is the sum of all elements up to and
 * including that index (the running / cumulative sum).
 *
 * Example:
 * Input:  arr = [1,2,3,4]
 * Output: [1,3,6,10]
 *
 * Technique: Precompute cumulative sums so range-sum queries become O(1).
 * Hint: prefix[i] = prefix[i-1] + arr[i]. Range sum(l,r) = prefix[r] - prefix[l-1].
 */
public class RunningSumOfArray {

    /**
     * TODO: implement using Prefix Sum.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int runningSumOfArray(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(RunningSumOfArray.runningSumOfArray(sample));
    }
}
