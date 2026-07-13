/**
 * Daily Temperatures
 * Topic: Monotonic Stack | Difficulty: Easy
 *
 * Problem:
 * Given a list of daily temperatures, find for each day how many days you'd have to wait for a
 * strictly warmer temperature (0 if there is none in the future).
 *
 * Example:
 * Input:  temps = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 *
 * Technique: A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n).
 * Hint: Pop elements that violate the monotonic property before pushing the new one.
 */
public class DailyTemperatures {

    /**
     * TODO: implement using Monotonic Stack.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int dailyTemperatures(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(DailyTemperatures.dailyTemperatures(sample));
    }
}
