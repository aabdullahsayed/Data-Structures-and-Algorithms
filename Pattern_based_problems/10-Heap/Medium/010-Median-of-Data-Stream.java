/**
 * Median of Data Stream
 * Topic: Heap | Difficulty: Medium
 *
 * Problem:
 * Design a data structure that supports adding integers one at a time and finding the median of
 * all elements seen so far in O(log n), using a max-heap for the lower half and a min-heap for
 * the upper half.
 *
 * Example:
 * Input:  addNum(1); addNum(2); findMedian(); addNum(3); findMedian()
 * Output: 1.5, then 2
 *
 * Technique: Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently.
 * Hint: Ask whether you repeatedly need the current min/max/kth extreme value.
 */
public class MedianOfDataStream {

    /**
     * TODO: implement using Heap.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int medianOfDataStream(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(MedianOfDataStream.medianOfDataStream(sample));
    }
}
