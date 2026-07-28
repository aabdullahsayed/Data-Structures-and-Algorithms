# Chapter 5: Bit Manipulation

## Easy Explanation
Every number is stored as 1s and 0s (bits). Bit manipulation means directly working with those bits — fast and memory-efficient, but takes some getting used to.

## Why It Matters
A small set of bit tricks appear again and again in interviews, and knowing them makes you look sharp. They're also genuinely useful for optimization problems.

## Cheat Sheet of Operators
| Operator | Symbol | What it does |
|---|---|---|
| AND | `&` | 1 only if both bits are 1 |
| OR | `\|` | 1 if either bit is 1 |
| XOR | `^` | 1 if bits are different |
| NOT | `~` | flips all bits |
| Left shift | `<<` | multiply by 2 per shift |
| Right shift | `>>` | divide by 2 per shift |

## Common Tricks
- **Check if bit i is set:** `(num >> i) & 1`
- **Set bit i:** `num | (1 << i)`
- **Clear bit i:** `num & ~(1 << i)`
- **Toggle bit i:** `num ^ (1 << i)`
- **Check if a number is a power of 2:** `num & (num - 1) == 0` (this trick removes the lowest set bit)
- **Swap two numbers without a temp variable:** using XOR three times.
- **Count set bits:** repeatedly do `num & (num - 1)` until num becomes 0 (each step removes one set bit).

## Classic Problems

### 1. Insertion — Insert one number's bits into another between positions i and j
**Easy idea:** Clear the bits from i to j in the target using a mask, then shift the new bits into place and OR them in.

### 2. Binary to String — Print binary representation of a decimal between 0 and 1
**Easy idea:** Keep multiplying the fraction by 2; each time it "overflows" past 1, that's a `1` bit, otherwise `0`.

### 3. Flip Bit to Win — Longest run of 1s you can get by flipping one 0 to 1
**Easy idea:** Track lengths of consecutive 1s separated by single 0s using a sliding window.

### 4. Next Number — Find the next smallest and next largest number with the same number of 1 bits
**Easy idea:** Manipulate the position of the rightmost non-trailing zero (for next largest) or rightmost non-trailing one (for next smallest).

### 5. Debugger (Conceptual) — Explain what `((n & (n-1)) == 0)` does
**Answer:** Checks whether n is a power of two (or zero), because it clears the lowest set bit — powers of two only have one set bit.

### 6. Pairwise Swap — Swap odd and even bits in a number with as few instructions as possible
**Easy idea:** Use masks to grab all even bits and all odd bits separately, shift them, then OR them together.

## Practice Tip
Draw the bits out on paper as boxes of 0/1 — bit problems become much easier when you can *see* them instead of just reasoning abstractly.
