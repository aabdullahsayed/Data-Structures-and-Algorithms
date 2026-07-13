/**
 * Binary Search on Answer
 * Topic: Binary Search | Difficulty: Medium
 *
 * Problem:
 * General pattern: given a monotonic condition over a range of possible answers, binary search on
 * the answer itself (not the array) to find the minimum/maximum valid answer. Implement a
 * concrete instance: Koko Eating Bananas — given piles of bananas and h hours, find the minimum
 * integer eating speed k such that Koko can finish all piles within h hours.
 *
 * Example:
 * Input:  piles = [3,6,7,11], h = 8
 * Output: 4
 *
 * Technique: Search a sorted space (array or answer range) by repeatedly halving it.
 * Hint: Define a clear predicate that is False...False,True...True (or vice versa) over the search space.
 */
public class BinarySearchOnAnswer {

    /**
     * TODO: implement using Binary Search.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int binarySearchOnAnswer(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(BinarySearchOnAnswer.binarySearchOnAnswer(sample));
    }
}
