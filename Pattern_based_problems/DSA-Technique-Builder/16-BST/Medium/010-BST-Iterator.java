/**
 * BST Iterator
 * Topic: BST | Difficulty: Medium
 *
 * Problem:
 * Design an iterator over a BST that supports next() (returns the next smallest value) and
 * hasNext(), running in average O(1) time per call using a controlled (stack-based) inorder
 * traversal.
 *
 * Example:
 * Input:  bst = [7,3,15,null,null,9,20]; next(); next(); hasNext()
 * Output: 3, 7, true
 *
 * Technique: Binary Search Tree specific properties: left < root < right.
 * Hint: Use the BST ordering property to prune search space, just like binary search.
 */
public class BSTIterator {

    /**
     * TODO: implement using BST.
     * Adjust the signature (parameter types / return type) to match the exact
     * input/output shape of this problem — the one below is a generic placeholder.
     */
    public static int bstIterator(int[] arr) {
        // TODO: implement
        return -1;
    }

    public static void main(String[] args) {
        // TODO: replace with real test cases based on the example above
        int[] sample = {};
        System.out.println(BSTIterator.bstIterator(sample));
    }
}
