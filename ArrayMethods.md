### List of **important and commonly used array operations/methods in Java**, covering both built-in and manual implementations (for primitive arrays and `ArrayList` where applicable):

---

### 🔹 **Array Basics**

| Operation           | Description                                 |
| ------------------- | ------------------------------------------- |
| `array.length`      | Returns the number of elements in the array |
| `array[index]`      | Accesses element at specific index          |
| `for/for-each` loop | Used to iterate over the array              |

---

### 🔹 **Common Operations**

| Operation                 | Description                                                     |
| ------------------------- | --------------------------------------------------------------- |
| **Traversal**             | Loop through array using `for`, `while`, or `for-each`          |
| **Copying**               | Use `System.arraycopy()` or `Arrays.copyOf()`                   |
| **Sorting**               | `Arrays.sort(array)` (ascending order)                          |
| **Searching**             | `Arrays.binarySearch(array, key)` (only works on sorted arrays) |
| **Filling**               | `Arrays.fill(array, value)` to fill all elements with a value   |
| **Comparison**            | `Arrays.equals(arr1, arr2)` to check element-wise equality      |
| **String representation** | `Arrays.toString(array)` to print arrays nicely                 |

---

### 🔹 **Manual Array Tasks (Common in Interviews)**

| Task                     | How It Works                                           |
| ------------------------ | ------------------------------------------------------ |
| **Find max/min**         | Loop and track max/min value                           |
| **Sum of elements**      | Accumulate values in loop                              |
| **Reverse an array**     | Use two pointers (start & end) and swap                |
| **Rotate array**         | Reverse parts + full array, or shift elements manually |
| **Count frequency**      | Use `Map` or nested loops                              |
| **Check for duplicates** | Use `Set`, or compare using loops                      |
| **Merge arrays**         | Create a new array and copy both                       |
| **Remove element**       | Shift elements and reduce size                         |
| **Check palindrome**     | Compare from both ends                                 |

---

### 🔹 **Conversion Utilities**

| Task                | How                                       |
| ------------------- | ----------------------------------------- |
| Array → List        | `Arrays.asList(array)` (for objects only) |
| List → Array        | `list.toArray(new Type[0])`               |
| String → Char Array | `str.toCharArray()`                       |
| Char Array → String | `new String(charArray)`                   |

---

### 🔹 **Java Utility Methods (Arrays class)**

Import first:

```java
import java.util.Arrays;
```

| Method                                | Description                                 |
| ------------------------------------- | ------------------------------------------- |
| `Arrays.sort(arr)`                    | Sorts array in ascending order              |
| `Arrays.toString(arr)`                | Returns a string representation             |
| `Arrays.equals(arr1, arr2)`           | Compares two arrays                         |
| `Arrays.fill(arr, value)`             | Fills array with the given value            |
| `Arrays.copyOf(arr, newLength)`       | Copies array into new array of given length |
| `Arrays.copyOfRange(arr, start, end)` | Partial copy of range                       |

---