# Chapter 3: Stacks & Queues

## Easy Explanation
- A **stack** is like a stack of plates: you can only add or remove from the top. **Last In, First Out (LIFO)**.
- A **queue** is like a line at a coffee shop: first person in line is served first. **First In, First Out (FIFO)**.

## Why It Matters
Stacks show up in anything involving "undo," matching brackets, or depth-first traversal (including recursion itself — the call stack!). Queues show up in scheduling and breadth-first traversal.

## Common Patterns
- **Stack for matching pairs**: parentheses validation, undo history.
- **Two stacks to build a queue** (or vice versa).
- **Monotonic stack**: keep the stack sorted as you push, useful for "next greater element" type problems.

## Key Complexity
| Operation | Stack | Queue |
|---|---|---|
| Push/Enqueue | O(1) | O(1) |
| Pop/Dequeue | O(1) | O(1) |
| Peek | O(1) | O(1) |

## Classic Problems

### 1. Three in One — Implement 3 stacks using a single array
**Easy idea:** Divide the array into 3 fixed-size sections, one per stack.

### 2. Stack Min — A stack that can return the minimum element in O(1)
**Easy idea:** Keep a second "min stack" that tracks the minimum at each point — push a new min whenever you push a smaller value.

### 3. Stack of Plates (SetOfStacks) — A stack that creates a new "sub-stack" once the current one is full
**Easy idea:** Keep a list of stacks; push to the last one, create a new one when it's full.

### 4. Queue via Stacks
**Easy idea:** Use two stacks — one for "incoming" pushes, one for "outgoing" pops. When the outgoing stack is empty, dump everything from incoming into outgoing (this reverses the order back to FIFO).

### 5. Sort Stack — Sort a stack using only one extra stack (no arrays/recursion)
**Easy idea:** Pop from the original stack; if the popped element is bigger than the top of the temp stack, push it back and shift things around until it's placed correctly.

### 6. Animal Shelter — A FIFO shelter for dogs and cats, can return "oldest of any type" or "oldest dog/cat"
**Easy idea:** Use two separate queues (one per animal type), tagging each with an "arrival order" timestamp.

## Practice Tip
Whenever you see "matching," "nested," "undo," or "balanced" in a problem — think **stack**. Whenever you see "process in order" or "level by level" — think **queue**.
