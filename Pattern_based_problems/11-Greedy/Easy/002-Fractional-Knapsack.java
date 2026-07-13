/**
 * Fractional Knapsack
 * Topic: Greedy | Difficulty: Easy
 *
 * Problem:
 * Given the weights and values of items and a knapsack capacity, maximize the total value where
 * items may be broken into fractions (unlike 0/1 knapsack).
 *
 * Example:
 * Input:  items=(weight,value): (10,60),(20,100),(30,120); capacity=50
 * Output: 240.0
 *
 * Technique: Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.
 * Hint: Sort by some criterion first, then make one pass making the best local choice.
 */
public class FractionalKnapsack {

    /**
     * TODO: implement using Greedy.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int fractionalKnapsack(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(FractionalKnapsack.fractionalKnapsack(sample));
    }
}
