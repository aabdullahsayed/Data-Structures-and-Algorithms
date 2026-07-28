# Chapter 10: Sorting & Searching

## Easy Explanation
**Sorting** means putting elements in order (ascending or descending). **Searching** means finding something efficiently — usually much faster once the data is sorted.

## Why It Matters
Many "hard" problems become easy once you sort first. Interviewers also want to see you know the standard sorting algorithms' trade-offs, and can adapt binary search to unusual situations.

## Sorting Algorithms Cheat Sheet
| Algorithm | Time (avg) | Time (worst) | Space | Notes |
|---|---|---|---|---|
| Bubble Sort | O(n²) | O(n²) | O(1) | Simple but slow, rarely used in practice |
| Selection Sort | O(n²) | O(n²) | O(1) | Simple, minimizes swaps |
| Insertion Sort | O(n²) | O(n²) | O(1) | Fast for nearly-sorted data |
| Merge Sort | O(n log n) | O(n log n) | O(n) | Stable, good for linked lists |
| Quick Sort | O(n log n) | O(n²) | O(log n) | Fast in practice, in-place |
| Heap Sort | O(n log n) | O(n log n) | O(1) | In-place, not stable |
| Radix/Bucket Sort | O(n·k) | O(n·k) | O(n) | Great for integers/limited range, not comparison-based |

## Searching
- **Linear Search**: check every element, O(n). Works on unsorted data.
- **Binary Search**: repeatedly cut the search space in half. Needs sorted data. O(log n).

## Common Patterns
- **Sort first, then use two pointers or binary search** — a huge fraction of problems reduce to this combo.
- **Modified binary search**: applies even when the array isn't perfectly sorted (e.g., rotated sorted array) — figure out which half is still sorted and search there.
- **Peeking at structure**: if the input has special structure (nearly sorted, mostly duplicates, limited value range) — a specialized sort (like counting sort) may beat O(n log n).

## Classic Problems

### 1. Sorted Merge — Merge two sorted arrays, where one has extra buffer space at the end
**Easy idea:** Fill the result **from the back** to avoid overwriting values you still need.

### 2. Group Anagrams
**Easy idea:** Use a hash map where the key is the sorted version of each word — words that are anagrams share the same sorted key.

### 3. Search in Rotated Array
**Easy idea:** Modified binary search — at each step, figure out which half (left or right of mid) is properly sorted, then decide which half the target could be in.

### 4. Sparse Search — Binary search in a sorted array with empty strings scattered throughout
**Easy idea:** If the middle is empty, scan outward to find the nearest non-empty string, then continue binary search from there.

### 5. Sort Big File — Sort a file too large to fit in memory
**Easy idea (External Sort):** Split the file into chunks that fit in memory, sort each chunk, write back to disk, then merge all sorted chunks together (like merge sort's merge step).

### 6. Rank from Stream — Track the rank (number of values ≤ x) of a growing stream of numbers
**Easy idea:** Use a self-balancing BST (or a rank-augmented tree) where each node tracks how many nodes are in its left subtree.

### 7. Peaks and Valleys — Rearrange an array to alternate between "peak" and "valley" elements
**Easy idea:** Walk through the array; whenever the current pattern is broken, swap the current element with its neighbor.

## Practice Tip
If you're stuck, ask: "What happens if I sort this first?" It's a cheap thing to try and it simplifies a surprising number of problems.
