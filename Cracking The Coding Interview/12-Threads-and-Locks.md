# Chapter 12: Threads & Locks (Concurrency)

## Easy Explanation
A **thread** is like a worker doing tasks. A **process** can have multiple threads working at the same time (sharing the same memory), which is faster but risky — if two workers touch the same shared item at the same time without coordinating, things can go wrong.

## Why It Matters
Concurrency bugs are notoriously hard to debug (they may only show up occasionally, depending on timing). This chapter tests whether you understand how to coordinate shared resources safely.

## Key Vocabulary
- **Race Condition**: bug caused by the outcome depending on unpredictable timing between threads.
- **Deadlock**: two or more threads wait forever for each other to release a resource — nobody moves.
- **Lock / Mutex**: a tool that only lets one thread access a resource at a time.
- **Semaphore**: like a lock but allows a set number (n) of threads to access a resource simultaneously.
- **Starvation**: a thread never gets a chance to run because other threads keep taking priority.
- **Livelock**: threads keep changing state in response to each other but never make actual progress.

## The Four Conditions for Deadlock (all must be true)
1. Mutual exclusion (a resource can only be held by one thread at a time)
2. Hold and wait (a thread holds one resource while waiting for another)
3. No preemption (a resource can't be forcibly taken away)
4. Circular wait (a cycle of threads each waiting on the next)

**To prevent deadlock**, break just one of these — e.g., always acquire locks in the same fixed order across all threads (this removes circular wait).

## Classic Problems

### 1. Thread vs. Process
**Easy idea:** A process has its own separate memory space. Threads within the same process share memory — communication between threads is fast (shared memory) but riskier (need synchronization); communication between processes is safer but slower (no shared memory by default).

### 2. Dining Philosophers Problem
**Easy idea (classic deadlock example):** Philosophers alternate thinking and eating, but need two forks (shared with neighbors) to eat. If everyone grabs their left fork at once, nobody can get a right fork — deadlock. Fix: enforce an ordering (e.g., the last philosopher picks up their right fork first, breaking the cycle).

### 3. Producer-Consumer Problem
**Easy idea:** A "producer" thread adds items to a shared queue, a "consumer" thread removes them. Use a lock plus a condition variable so the consumer waits when the queue is empty and the producer waits when it's full.

### 4. FizzBuzz with Multiple Threads
**Easy idea:** Use synchronization (like semaphores) to make sure threads print numbers in the correct order even though they run "in parallel."

## Practice Tip
When discussing concurrency out loud, always mention **what shared resource could be accessed by two threads at once**, and **how your solution prevents that** — that's the heart of every concurrency answer.
