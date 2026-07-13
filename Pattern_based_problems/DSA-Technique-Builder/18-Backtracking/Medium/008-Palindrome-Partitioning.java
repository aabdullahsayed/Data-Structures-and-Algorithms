/**
 * Palindrome Partitioning
 * Topic: Backtracking | Difficulty: Medium
 *
 * Problem:
 * Given a string, partition it so that every substring in the partition is a palindrome, and
 * return all such possible partitions.
 *
 * Example:
 * Input:  s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 *
 * Technique: Explore all possibilities via recursion, undoing choices that don't work (prune early).
 * Hint: Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.
 */
public class PalindromePartitioning {

    /**
     * TODO: implement using Backtracking.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int palindromePartitioning(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(PalindromePartitioning.palindromePartitioning(sample));
    }
}
