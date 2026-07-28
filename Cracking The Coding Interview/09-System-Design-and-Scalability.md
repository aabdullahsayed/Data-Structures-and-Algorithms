# Chapter 9: System Design & Scalability

## Easy Explanation
These questions ask you to design a large-scale system (like TinyURL, a social network, or a search engine) that can handle huge amounts of traffic and data — way more than fits on one computer.

## Why It Matters
Real companies run systems with millions of users. This chapter tests whether you can reason about trade-offs at scale: speed vs. cost, consistency vs. availability, simplicity vs. flexibility.

## Step-by-Step Approach (a repeatable framework)
1. **Communicate clearly** — restate the problem, ask about scale (how many users? how much data?).
2. **Define the core cases** — what are the 2–3 most important features to support?
3. **Design at a high level** — draw boxes: clients, servers, databases, caches, load balancers.
4. **Identify bottlenecks** — where will this design break under heavy load?
5. **Scale the bottlenecked parts** — apply techniques below.

## Key Concepts (plain-English glossary)
- **Horizontal scaling**: add more machines (vs. **vertical scaling**: make one machine bigger).
- **Load Balancer**: a traffic cop that spreads requests across many servers.
- **Caching**: store frequently-used data in fast memory (like Redis) so you don't hit the slow database every time.
- **Database Sharding**: split one giant database into smaller pieces (shards), each holding part of the data, spread across machines.
- **Replication**: keep copies of data on multiple servers for speed and backup safety.
- **CAP Theorem**: in a distributed system, you can only fully guarantee 2 of 3: **C**onsistency, **A**vailability, **P**artition tolerance.
- **Asynchronous processing (Message Queues)**: don't make the user wait for slow work (like sending an email) — hand it off to a background worker.

## Back-of-the-Envelope Estimation
Interviewers love when you estimate scale with round numbers:
- 1 million users, each doing 10 requests/day → ~115 requests/second average.
- Always account for peak traffic being several times higher than average.

## Classic Problems

### 1. Design TinyURL
**Easy idea:** Generate a short unique code (base62 encoding of an incrementing ID, or a hash), store `short → long URL` mapping in a fast key-value database, use caching for popular links.

### 2. Design a Web Crawler
**Easy idea:** Use a queue of URLs to visit, a "seen" set to avoid revisiting, and distribute crawling across many worker machines.

### 3. Design a Social Network's News Feed
**Easy idea:** Trade-off between "pull" (compute the feed when the user opens the app) vs. "push" (pre-compute and store each user's feed when their friends post) — push is faster to read but expensive for users with huge friend counts.

### 4. Mutual Friends (given a huge social graph)
**Easy idea:** Partition (shard) users across servers by ID range, and for cross-shard queries, query relevant shards in parallel.

## Practice Tip
There's rarely one "correct" design — the interviewer wants to hear you reason about trade-offs out loud, not recite a memorized architecture.
