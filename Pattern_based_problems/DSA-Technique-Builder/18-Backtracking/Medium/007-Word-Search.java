/**
 * Word Search
 * Topic: Backtracking | Difficulty: Medium
 *
 * Problem:
 * Given a 2D grid of letters and a word, determine whether the word can be formed by a sequence
 * of adjacent (horizontally or vertically) cells, without reusing any cell.
 *
 * Example:
 * Input:  board=[[A,B,C,E],[S,F,C,S],[A,D,E,E]], word="ABCCED"
 * Output: true
 *
 * Technique: Explore all possibilities via recursion, undoing choices that don't work (prune early).
 * Hint: Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.
 */
public class WordSearch {

    /**
     * TODO: implement using Backtracking.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int wordSearch(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(WordSearch.wordSearch(sample));
    }
}
