/**
 * Candy Distribution
 * Topic: Greedy | Difficulty: Medium
 *
 * Problem:
 * Given the ratings of children standing in a line, distribute candies so every child gets at
 * least one, and any child with a higher rating than an adjacent neighbor gets more candies than
 * that neighbor. Minimize the total candies handed out.
 *
 * Example:
 * Input:  ratings = [1,0,2]
 * Output: 5
 *
 * Technique: Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.
 * Hint: Sort by some criterion first, then make one pass making the best local choice.
 */
public class CandyDistribution {

    /**
     * TODO: implement using Greedy.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int candyDistribution(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(CandyDistribution.candyDistribution(sample));
    }
}
