/**
 * Combination Sum
 * Topic: Backtracking | Difficulty: Medium
 *
 * Problem:
 * Given an array of distinct positive integers and a target, find all unique combinations of
 * numbers (each number may be reused any number of times) that sum exactly to the target.
 *
 * Example:
 * Input:  candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 *
 * Technique: Explore all possibilities via recursion, undoing choices that don't work (prune early).
 * Hint: Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.
 */
public class CombinationSum {

    /**
     * TODO: implement using Backtracking.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int combinationSum(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(CombinationSum.combinationSum(sample));
    }
}
