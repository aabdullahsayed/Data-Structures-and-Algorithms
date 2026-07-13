# DSA Technique Builder

A structured, technique-first Data Structures & Algorithms practice repo.
Each folder is a **pattern/technique**, split into `Easy/` and `Medium/` problems.
Every problem has two files: a `.md` with a clear problem statement, example,
technique hint, and approach notes — and a matching `.java` starter file with
a class/method stub you implement yourself.

## How to use this repo

1. Pick a topic folder in order (Two Pointers -> Sliding Window -> Binary Search -> ...).
2. Solve `Easy/` problems before `Medium/` in that folder.
3. Implement the starter function, test it, then check off the Status boxes in the file.
4. Commit after each solved problem — small, frequent commits build a strong practice log.

## Topics

- **01-Two-Pointers** — Use two indices moving through the data (from ends, or one fast/one slow) to avoid nested loops. _(Easy: 15, Medium: 10)_
- **02-Sliding-Window** — Maintain a window [left, right] over the array/string and expand/shrink it based on a condition. _(Easy: 12, Medium: 8)_
- **03-Binary-Search** — Search a sorted space (array or answer range) by repeatedly halving it. _(Easy: 12, Medium: 8)_
- **04-Prefix-Sum** — Precompute cumulative sums so range-sum queries become O(1). _(Easy: 10, Medium: 10)_
- **05-Hashing** — Use hash maps/sets for O(1) average lookups to avoid brute-force nested loops. _(Easy: 12, Medium: 8)_
- **06-Stack** — LIFO structure, useful for matching, backtracking state, and expression evaluation. _(Easy: 12, Medium: 8)_
- **07-Queue** — FIFO structure, useful for order-preserving processing and BFS-style problems. _(Easy: 8, Medium: 5)_
- **08-Monotonic-Stack** — A stack that stays increasing or decreasing, used to find next/previous greater or smaller elements in O(n). _(Easy: 4, Medium: 6)_
- **09-Monotonic-Queue** — A deque that stays monotonic, used for sliding-window max/min in O(n). _(Easy: 2, Medium: 3)_
- **10-Heap** — Priority queue (min-heap/max-heap) for repeatedly getting the smallest/largest element efficiently. _(Easy: 6, Medium: 6)_
- **11-Greedy** — Make the locally optimal choice at each step and prove (or trust) it leads to a global optimum. _(Easy: 5, Medium: 7)_
- **12-Intervals** — Problems about ranges [start, end] — merging, overlapping, scheduling. _(Easy: 3, Medium: 5)_
- **13-Fast-Slow-Pointers** — Two pointers moving at different speeds through a sequence/linked list — great for cycle detection. _(Easy: 3, Medium: 4)_
- **14-Linked-List** — Core singly/doubly linked list manipulation. _(Easy: 6, Medium: 6)_
- **15-Trees** — Binary tree traversal and properties (DFS/BFS based). _(Easy: 8, Medium: 7)_
- **16-BST** — Binary Search Tree specific properties: left < root < right. _(Easy: 5, Medium: 5)_
- **17-Graphs** — Graph representation and traversal (BFS/DFS), shortest paths, connectivity. _(Easy: 4, Medium: 9)_
- **18-Backtracking** — Explore all possibilities via recursion, undoing choices that don't work (prune early). _(Easy: 2, Medium: 6)_
- **19-Dynamic-Programming** — Break problems into overlapping subproblems and cache results to avoid recomputation. _(Easy: 4, Medium: 9)_
- **20-Bit-Manipulation** — Use bitwise operators (&, |, ^, ~, <<, >>) for compact and fast computation. _(Easy: 5, Medium: 4)_
- **21-Math** — Number theory and mathematical algorithms. _(Easy: 5, Medium: 4)_
