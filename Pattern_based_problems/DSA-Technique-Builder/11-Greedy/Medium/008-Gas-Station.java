/**
 * Gas Station
 * Topic: Greedy | Difficulty: Medium
 *
 * Problem:
 * Given gas and cost arrays for a circular route of gas stations, find the starting station index
 * from which a car can complete the entire circuit, or -1 if impossible.
 *
 * Example:
 * Input:  gas=[1,2,3,4,5], cost=[3,4,5,1,2]
 * Output: 3
 *
 * Technique: Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum.
 * Hint: Sort by some criterion first, then make one pass making the best local choice.
 */
public class GasStation {

    /**
     * TODO: implement using Greedy.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int gasStation(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(GasStation.gasStation(sample));
    }
}
