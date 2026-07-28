# Chapter 11: Testing

## Easy Explanation
Testing questions ask "how would you make sure this thing works correctly?" — whether "this thing" is a piece of code, a physical product (like a pen), or a whole system (like an ATM).

## Why It Matters
Good engineers don't just write code — they think about how it can break. This chapter tests structured, thorough thinking, not a specific algorithm.

## The General Framework
1. **Who are the users?** Different users test differently (a power user vs. a first-time user).
2. **What are the use cases?** List the normal, expected ways the thing gets used.
3. **What are the edge cases / boundary conditions?** Empty input, maximum size, invalid input, concurrent use.
4. **What's the testing environment / constraints?** Manual vs. automated, real-world conditions.

## Types of Testing (good vocabulary to know)
- **Unit Testing**: test one small function/component in isolation.
- **Integration Testing**: test that multiple components work together correctly.
- **System Testing**: test the whole product end-to-end.
- **Acceptance/User Testing**: real users try the product to confirm it meets their needs (alpha/beta testing).
- **Black-box testing**: testing behavior without knowing the internal code.
- **White-box testing**: testing with full knowledge of the internal code/logic.

## Classic Problems

### 1. Test a Pen
**Easy idea:** Think about *who* uses it (kids, artists, office workers), *how* (writing, dropping, storing), and edge cases (running out of ink, extreme temperatures, being left uncapped).

### 2. Test an ATM
**Easy idea:** Break it down: hardware (card reader, cash dispenser, screen), software (balance checks, transaction logic), and edge cases (network failure mid-transaction, insufficient funds, invalid PIN, power outage).

### 3. Test a Piece of Code (e.g., a `sort()` function)
**Easy idea:** Test normal input, empty input, single-element input, already-sorted input, reverse-sorted input, duplicates, very large input (performance), and invalid types.

### 4. How would you test if a webpage renders correctly across browsers?
**Easy idea:** Combination of automated cross-browser testing tools + manual spot checks + comparing against a "known good" reference screenshot.

## Practice Tip
Structure your answer out loud: "I'd break this into functional testing, edge cases, and non-functional concerns like performance and security." Interviewers reward organized thinking more than an exhaustive list.
