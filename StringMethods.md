### List of **important and commonly used String methods in Java**, categorized by usage:

---

### 🔹 **Basic Methods**

| Method                                    | Description                                  |
| ----------------------------------------- | -------------------------------------------- |
| `length()`                                | Returns the length of the string             |
| `charAt(int index)`                       | Returns the character at the specified index |
| `substring(int beginIndex)`               | Returns substring from the index to the end  |
| `substring(int beginIndex, int endIndex)` | Returns substring between the two indices    |
| `indexOf(String str)`                     | Returns the first index of the substring     |
| `lastIndexOf(String str)`                 | Returns the last index of the substring      |
| `equals(String str)`                      | Checks if two strings are exactly equal      |
| `equalsIgnoreCase(String str)`            | Case-insensitive comparison                  |
| `compareTo(String str)`                   | Lexicographically compares two strings       |
| `isEmpty()`                               | Checks if the string is empty                |

---

### 🔹 **Case Conversion & Trimming**

| Method          | Description                             |
| --------------- | --------------------------------------- |
| `toUpperCase()` | Converts all characters to uppercase    |
| `toLowerCase()` | Converts all characters to lowercase    |
| `trim()`        | Removes leading and trailing whitespace |

---

### 🔹 **Searching & Matching**

| Method                      | Description                                       |
| --------------------------- | ------------------------------------------------- |
| `contains(CharSequence s)`  | Checks if the string contains a sequence          |
| `startsWith(String prefix)` | Checks if the string starts with given prefix     |
| `endsWith(String suffix)`   | Checks if the string ends with given suffix       |
| `matches(String regex)`     | Checks if the string matches a regular expression |

---

### 🔹 **Modification Methods**

| Method                                         | Description                                 |
| ---------------------------------------------- | ------------------------------------------- |
| `replace(char oldChar, char newChar)`          | Replaces all occurrences of a char          |
| `replaceAll(String regex, String replacement)` | Replaces all substrings matching regex      |
| `split(String regex)`                          | Splits the string using the regex delimiter |
| `concat(String str)`                           | Concatenates the given string               |

---

### 🔹 **Conversion Methods**

| Method                        | Description                              |
| ----------------------------- | ---------------------------------------- |
| `toCharArray()`               | Converts the string to a character array |
| `getBytes()`                  | Converts the string to a byte array      |
| `valueOf(int num)` *(static)* | Converts a number to string              |

---