# Chapter 1: Arrays & Strings

## Easy Explanation
An **array** is just a row of boxes, each holding one value, numbered starting at 0.
A **string** is basically an array of characters.
Because the boxes sit next to each other in memory, you can jump to any box instantly (**O(1) access**), but adding/removing in the middle means shifting all the boxes after it (**O(n)**).

## Why It Matters
Arrays and strings are the most common data types in interviews. Many "clever trick" questions are really about using arrays smartly (two pointers, hashing, sliding window) instead of brute force.

## Common Patterns
- **Hash Set/Map for lookups**: Trade space for speed — checking "have I seen this before?" in O(1) instead of O(n).
- **Two Pointers**: One pointer from the start, one from the end (or both moving forward), useful for sorted arrays, palindromes, reversing.
- **Sliding Window**: Keep a moving "window" of elements to track sums/substrings without rechecking everything.
- **Sorting first**: Many problems get easier once the array is sorted (duplicates, closest pair, etc.)

## Key Complexity
| Operation | Array | String (immutable, e.g. Java/Python) |
|---|---|---|
| Access by index | O(1) | O(1) |
| Search | O(n) | O(n) |
| Insert/Delete (middle) | O(n) | O(n) — creates a new string |
| Append (amortized, dynamic array) | O(1) | O(n) |

## Classic Problems (from CTCI)

### 1. Is Unique — Check if a string has all unique characters
**Easy idea:** Use a set. Walk through each character; if you've seen it before, return false.
```python
def is_unique(s):
    seen = set()
    for ch in s:
        if ch in seen:
            return False
        seen.add(ch)
    return True
```
Time: O(n), Space: O(min(n, alphabet size))

### 2. Check Permutation — Do two strings have the same characters, rearranged?
**Easy idea:** Sort both strings and compare, OR count character frequencies.
```python
def check_permutation(a, b):
    if len(a) != len(b):
        return False
    return sorted(a) == sorted(b)
```
Time: O(n log n) for sorting version; O(n) with counting.

### 3. URLify — Replace spaces with `%20` in place
**Easy idea:** Count spaces first, then fill the string from the **end backward** so you don't overwrite characters you still need.

### 4. Palindrome Permutation — Can a string be rearranged into a palindrome?
**Easy idea:** A string can form a palindrome if **at most one character** has an odd count.

### 5. One Away — Are two strings one edit (insert/remove/replace) apart?
**Easy idea:** Compare lengths first. If equal, count differing characters. If lengths differ by 1, check if removing one char from the longer makes them equal.

### 6. String Compression — "aabcccccaaa" → "a2b1c5a3"
**Easy idea:** Walk through, count consecutive repeats, build a new string. Return original if compression isn't shorter.

### 7. Rotate Matrix — Rotate an N×N matrix 90 degrees in place
**Easy idea:** Rotate layer by layer (like rings of an onion), swapping 4 elements at a time.

### 8. Zero Matrix — If an element is 0, set its entire row and column to 0
**Easy idea:** First pass: record which rows/columns contain a 0. Second pass: zero them out.

## Practice Tip
When you see "in place" or "no extra space," think **two pointers** or working **from the end backward**.
