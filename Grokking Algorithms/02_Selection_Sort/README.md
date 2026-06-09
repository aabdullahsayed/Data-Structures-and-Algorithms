### How Memory Works

* **The Analogy:** Computer memory is like a giant chest of drawers where each drawer has a specific address.
* **Storage Requirement:** Every time you want to store an item, you must ask the computer for space, and it returns a memory address.
* **Basic Multi-Item Storage:** There are two primary ways to store multiple items in memory: arrays and lists.

### Arrays

* **Contiguous Storage:** Elements are stored right next to each other in memory.
* **The "Pain" of Resizing:** If you run out of space and need to add a new item, the computer may have to find an entirely new, larger chunk of memory and move all existing items there, which is very slow.
* **Workaround:** You can "hold seats" by asking for extra slots in advance, but this can waste memory if slots go unused, or still fail if you exceed the pre-allocated limit.
* **Random Access:** You know the exact memory address of every item. This allows you to jump directly to and read any element instantly.
* **Array Indexing:** Elements are numbered starting from 0 (index 0) rather than 1.
* **Element Uniformity:** All elements in an array must be of the exact same data type (e.g., all ints, all doubles).

### Linked Lists

* **Scattered Storage:** Items can be strewn anywhere throughout memory; they do not need to be next to each other.
* **Memory Linking:** Each item stores its own data along with the memory address of the next item in the list (like a treasure hunt).
* **Easy Insertions/Deletions:** Adding or removing an item is fast and easy because you just stick it anywhere in memory and update the address link in the previous item. You never have to move items.
* **Sequential Access:** You cannot jump directly to a random position. To read the last or a specific middle element, you must start at the first item and follow the chain of addresses one by one. This makes random reads very slow.

### Performance Summary

* **Arrays:** Faster at reads because they support random access.
* **Linked Lists:** Faster at insertions and deletions (especially in the middle or at the beginning/end) because they don't require shifting elements in memory.

### Run Times Table

| Operation | Arrays | Lists |
| --- | --- | --- |
| **Reading** | $O(1)$ | $O(n)$ |
| **Insertion** | $O(n)$ | $O(1)$ |
| **Deletion** | $O(n)$ | $O(1)$ |

---
