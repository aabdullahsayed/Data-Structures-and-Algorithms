# Chapter: Interview Approach & Tips

## Easy Explanation
Solving the problem is only half the battle — **how** you approach it matters just as much. Interviewers are watching your process, communication, and problem-solving instincts.

## The 5-Step Approach (from CTCI, simplified)
1. **Listen carefully** — note every detail and constraint in the question. Repeat it back in your own words.
2. **Draw an example** — a specific, non-trivial example on paper/whiteboard helps you (and the interviewer) see the pattern.
3. **State a brute-force solution first** — even a slow, obvious solution is better than silence. It also gives you something to optimize.
4. **Optimize** — look for repeated work (→ memoization), unnecessary steps, or a better data structure (→ hash map for lookups, sorting for ordering, etc.)
5. **Walk through your solution before coding** — trace through your example by hand to catch bugs early, before you've written a single line of code.
6. **Implement** — write clean, modular code. Use good variable names even under pressure.
7. **Test** — walk through your code with the example again, and check edge cases (empty input, one element, duplicates, negative numbers).

## BUD Optimization Framework (for spotting inefficiencies)
- **B**ottlenecks — what's the slowest part of your current approach?
- **U**nnecessary work — are you recomputing something you already know?
- **D**uplicated work — are you doing the same operation on the same data more than once?

## Communication Tips
- Talk through your thinking out loud — silence makes it impossible for the interviewer to help or follow along.
- It's okay to say "let me think for a moment" — just don't go silent for too long.
- If you're stuck, mention a brute-force idea even if you know it's not optimal — it shows progress and often sparks the better idea.

## Common Mistakes to Avoid
- Jumping straight to code without a plan.
- Ignoring edge cases until the interviewer points them out.
- Not stating time/space complexity.
- Getting defensive about bugs — just calmly fix them; everyone writes bugs live.

## Practice Tip
Practice explaining your solution **out loud**, even when studying alone. The ability to narrate your thinking clearly is a skill in itself, separate from solving the problem.
