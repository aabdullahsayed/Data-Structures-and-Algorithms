# Chapter: Big O — A Quick Refresher

## Easy Explanation
Big O describes how the **time or space a solution needs grows** as the input gets bigger. It's not about exact seconds — it's about the *shape* of growth.

## Easy Growth-Rate Ranking (fastest to slowest)
`O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!)`

## Plain-English Meaning
- **O(1) — Constant**: same speed no matter the input size (e.g., array index lookup).
- **O(log n) — Logarithmic**: cuts the problem in half each step (e.g., binary search).
- **O(n) — Linear**: touches each element once (e.g., simple loop).
- **O(n log n) — Linearithmic**: typical of good sorting algorithms (merge sort, quicksort average case).
- **O(n²) — Quadratic**: nested loops over the same data (e.g., comparing every pair).
- **O(2ⁿ) — Exponential**: typical of brute-force recursion exploring all subsets.
- **O(n!) — Factorial**: brute-force exploring all orderings/permutations.

## Rules of Thumb
- **Drop constants**: O(2n) is just O(n).
- **Drop non-dominant terms**: O(n² + n) is just O(n²).
- **Different inputs get different variables**: comparing two arrays of size a and b is O(a·b), not O(n²).
- **Amortized time**: sometimes an occasional expensive operation (like resizing an array) is "spread out" over many cheap ones, giving an average O(1) even though single operations occasionally cost more.
- **Recursive calls**: a recursive function that makes `b` calls each reducing input by a fraction, going `d` levels deep, does roughly O(b^d) work — this is why unmemoized recursion (like naive Fibonacci) explodes exponentially.

## How to Spot Complexity Quickly
| Code Pattern | Likely Complexity |
|---|---|
| Single loop over n items | O(n) |
| Nested loop over n items | O(n²) |
| Loop that halves the range each time | O(log n) |
| Loop + inner binary search | O(n log n) |
| Recursion branching into 2 calls each step | O(2ⁿ) (unless memoized) |
| Sorting the input | O(n log n) |

## Practice Tip
When analyzing your own solution in an interview, say the complexity **out loud** and briefly justify it ("this is O(n) because we visit each element exactly once"). It shows you're thinking about efficiency, not just correctness.
