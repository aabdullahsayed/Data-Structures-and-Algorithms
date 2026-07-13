/**
 * Rat in a Maze
 * Topic: Backtracking | Difficulty: Medium
 *
 * Problem:
 * Given an n x n maze of 0s (blocked) and 1s (open), find all distinct paths for a rat to travel
 * from the top-left cell to the bottom-right cell, moving only through open cells.
 *
 * Example:
 * Input:  maze = [[1,0,0,0],[1,1,0,1],[1,1,0,0],[0,1,1,1]]
 * Output: ["DDRDRR"]
 *
 * Technique: Explore all possibilities via recursion, undoing choices that don't work (prune early).
 * Hint: Pattern: choose -> explore -> un-choose. Add pruning conditions to cut branches early.
 */
public class RatInAMaze {

    /**
     * TODO: implement using Backtracking.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int ratInAMaze(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(RatInAMaze.ratInAMaze(sample));
    }
}
