
# Time Complexity Cheat Sheet

A **complete and categorized table** with **loop constructs, sorting, searching, recursion, data structure operations**, and more.

---

## ✅ Time Complexity Cheat Sheet

### 🔁 Basic Loops

| Category            | Operation / Algorithm           | Time Complexity      | Best Case | Average Case | Worst Case |
|---------------------|--------------------------------|---------------------|-----------|--------------|------------|
| **Basic Loops**     | `for (int i = 0; i < n; i++)`  | O(n)                | -         | -            | -          |
|                     | Nested `for` loops              | O(n²), O(n³), etc.  | -         | -            | -          |
|                     | `while (i < n)`                | O(n)                | -         | -            | -          |
|                     | Logarithmic `while (i /= 2)`   | O(log n)            | -         | -            | -          |

---

### 🔍 Searching Algorithms

| Algorithm                | Time Complexity | Best    | Average   | Worst    |
|--------------------------|----------------|---------|-----------|----------|
| Linear Search            | O(n)           | O(1)    | O(n/2)    | O(n)     |
| Binary Search (sorted)   | O(log n)       | O(1)    | O(log n)  | O(log n) |
| Ternary Search           | O(log₃ n)      | O(1)    | O(log n)  | O(log n) |
| Jump Search              | O(√n)          | O(1)    | O(√n)     | O(√n)    |
| Exponential Search       | O(log n)       | O(1)    | O(log n)  | O(log n) |

---

### 🔃 Sorting Algorithms

| Algorithm      | Best         | Average      | Worst        | Space    | Stable   |
|----------------|--------------|--------------|--------------|----------|----------|
| Bubble Sort    | O(n)         | O(n²)        | O(n²)        | O(1)     | ✅ Yes   |
| Insertion Sort | O(n)         | O(n²)        | O(n²)        | O(1)     | ✅ Yes   |
| Selection Sort | O(n²)        | O(n²)        | O(n²)        | O(1)     | ❌ No    |
| Merge Sort     | O(n log n)   | O(n log n)   | O(n log n)   | O(n)     | ✅ Yes   |
| Quick Sort     | O(n log n)   | O(n log n)   | O(n²)        | O(log n) | ❌ No    |
| Heap Sort      | O(n log n)   | O(n log n)   | O(n log n)   | O(1)     | ❌ No    |
| Counting Sort  | O(n + k)     | O(n + k)     | O(n + k)     | O(k)     | ✅ Yes   |
| Radix Sort     | O(nk)        | O(nk)        | O(nk)        | O(n + k) | ✅ Yes   |
| Bucket Sort    | O(n + k)     | O(n + k)     | O(n²)        | O(n + k) | ✅ Yes   |

---

### 🔁 Recursion & Divide and Conquer

| Algorithm/Pattern         | Time Complexity |
|--------------------------|-----------------|
| Factorial (recursive)     | O(n)            |
| Fibonacci (recursive)     | O(2ⁿ)           |
| Fibonacci (DP/Memoized)   | O(n)            |
| Tower of Hanoi            | O(2ⁿ)           |
| Binary Search (recursive) | O(log n)        |
| Merge Sort                | O(n log n)      |
| Quick Sort                | O(n log n)      |

---

### 📦 Data Structures

| Data Structure            | Insert      | Delete     | Search/Access         | Remarks         |
|--------------------------|-------------|------------|-----------------------|-----------------|
| Array (unsorted)         | O(1)        | O(n)       | O(n)                  |                 |
| Array (sorted)           | O(n)        | O(n)       | O(log n) (bin search) |                 |
| Stack                    | O(1)        | O(1)       | O(n)                  | LIFO            |
| Queue                    | O(1)        | O(1)       | O(n)                  | FIFO            |
| HashMap / HashTable      | O(1)        | O(1)       | O(1)                  | Best avg        |
| LinkedList (Singly)      | O(1) (head) | O(1)       | O(n)                  |                 |
| Binary Search Tree (BST) | O(log n)    | O(log n)   | O(log n)              | Balanced only   |
| Heap (Min/Max)           | O(log n)    | O(log n)   | O(1) (peek)           |                 |
| Trie                     | O(m)        | O(m)       | O(m)                  | m = word length |

---

### ⏲️ Other Useful Complexities

| Concept                                 | Time Complexity      |
|------------------------------------------|---------------------|
| Matrix Traversal (2D)                    | O(m × n)            |
| String Concatenation (naive)             | O(n²)               |
| StringBuilder in Java                    | O(n)                |
| Power of number (naive)                  | O(n)                |
| Power using fast exponentiation          | O(log n)            |
| GCD using Euclidean Algo                 | O(log(min(a, b)))   |
| DFS/BFS (Graph)                          | O(V + E)            |
| Dijkstra's Algorithm                     | O((V + E) log V)    |
| Floyd Warshall (All-Pairs Shortest Path) | O(n³)               |
| Bellman-Ford Algorithm                   | O(V × E)            |
| Kruskal’s MST                            | O(E log E)          |
| Prim’s MST                               | O(E + log V)        |

---

## ✅ Tips for Interviews

- Always ask if input is **sorted**, or if it allows **duplicates** — it affects complexity.
- Think about **space complexity** too.
- For nested loops, **analyze inner and outer bounds**.
- Learn to optimize using **HashMaps, Sets, Prefix Sums, Sliding Window, Binary Search**.

---

*Feel free to copy, share, and extend this cheat sheet!*
