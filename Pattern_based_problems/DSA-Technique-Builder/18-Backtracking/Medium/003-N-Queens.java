/**
 * N Queens
 * Topic: Backtracking | Difficulty: Medium
 *
 * Problem:
 * Given an integer n, place n queens on an n x n chessboard so that no two queens attack each
 * other, and return all distinct valid board configurations.
 *
 * Example:
 * Input:  n = 4
 * Output: 2 distinct solutions
 *
 * Technique: Explore all possibilities via recursion, undoing choices that don't work (prune early).
 * Hint: Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.
 */
public class NQueens {

    /**
     * TODO: implement using Backtracking.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int nQueens(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(NQueens.nQueens(sample));
    }
}
