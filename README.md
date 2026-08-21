# ☕ Java Programming & DSA Practice

> A beginner-friendly collection of **Java Programming, Methods, Number Problems, OOP, DSA, and LeetCode solutions**.

This repository contains the Java programs I practice while building strong fundamentals in **logic building, problem solving, methods, loops, conditions, OOP, and Data Structures & Algorithms**.

---

## 🚀 What You'll Find Here

- ☕ Java Programming Fundamentals
- 🔢 Number & Digit Problems
- 🧩 Java Methods Practice
- 🏗️ Object-Oriented Programming
- 🧠 DSA Problem Solving
- 💻 LeetCode Solutions
- 📈 Coding Interview Preparation

---

## 📚 Java Fundamentals

Practice programs covering:

- Variables & Data Types
- User Input using `Scanner`
- `if-else` and conditional logic
- `for`, `while`, and `do-while` loops
- Methods and reusable logic
- Basic OOP
- Classes and Objects
- Constructors
- Number manipulation
- Logical problem solving

---

## 🔢 Number-Based Programs

| # | Program | Concept |
|---:|---|---|
| 1 | `GCD.java` | GCD of two numbers |
| 2 | `LCM.java` | LCM of two numbers |
| 3 | `CountDigits.java` | Count digits |
| 4 | `SumOfDigits.java` | Sum of digits |
| 5 | `SumOfDigitsMethod.java` | Sum of digits using method |
| 6 | `PerfectNumber.java` | Perfect number |
| 7 | `PerfectNumberMethod.java` | Perfect number using method |
| 8 | `PrimeNumberMethod.java` | Prime number using method |
| 9 | `LargestDigit.java` | Largest digit |
| 10 | `SumEvenDigits.java` | Sum of even digits |
| 11 | `EvenOddMethod.java` | Even or odd using method |
| 12 | `LargestAmongThreeMethod.java` | Largest of three using method |
| 13 | `LargestNumber.java` | Largest among three numbers |
| 14 | `ReverseNumber.java` | Reverse a number |
| 15 | `ReverseAndSum.java` | Reverse + digit sum |
| 16 | `ArmstrongNumber.java` | Armstrong number |
| 17 | `FibonacciSeries.java` | Fibonacci series |
| 18 | `RepeatedDigits.java` | Repeated digit detection |
| 19 | `RepeatedDigits1To100.java` | Repeated digits from 1–100 |

---

## 🧩 Methods Practice

These programs specifically focus on writing reusable Java methods:

- `PrimeNumberMethod.java` → Check whether a number is prime
- `MultiplicationTableMethod.java` → Print multiplication table
- `PerfectNumberMethod.java` → Check whether a number is perfect
- `EvenOddMethod.java` → Check even or odd
- `LargestAmongThreeMethod.java` → Find largest of three numbers
- `SumOfDigitsMethod.java` → Calculate sum of digits

### Why Methods?

Instead of putting all logic inside `main()`, a method allows us to write reusable logic:

```java
static boolean isPrime(int n) {
    // logic
}
```

Then we can simply call:

```java
isPrime(n);
```

This makes programs **cleaner, reusable, and easier to understand**.

---

## 💡 Important Number Logic

Most digit-based problems use these two operators:

### `% 10` → Get the last digit

```java
int digit = n % 10;
```

Example:

```text
1234 % 10 = 4
```

### `/ 10` → Remove the last digit

```java
n = n / 10;
```

Example:

```text
1234 / 10 = 123
```

### 🔄 Common Pattern

```text
Number
   ↓
Extract last digit (% 10)
   ↓
Process digit
   ↓
Remove last digit (/ 10)
   ↓
Repeat until number becomes 0
```

This pattern is used in:

- Count Digits
- Sum of Digits
- Largest Digit
- Sum of Even Digits
- Reverse Number
- Armstrong Number
- Repeated Digit Problems

---

## 🧠 DSA & LeetCode

The repository also contains solutions for common DSA patterns:

### Arrays & Strings
- Array manipulation
- String problems
- Searching
- Sorting

### Hashing
- HashMap
- HashSet
- Frequency counting

### Two Pointers
- Pair problems
- Array optimization
- String problems

### Linked Lists
- Traversal
- Insertion/deletion
- Reversal

### Trees
- Binary Trees
- Binary Search Trees
- Tree traversal

### Dynamic Programming
- Basic DP problems
- Optimization problems

### Other Patterns
- Stack & Queue
- Greedy
- Backtracking
- Matrix/Grid problems

---

## ▶️ How to Run Java Programs

### 1. Check Java installation

```bash
java -version
```

### 2. Compile a program

```bash
javac PrimeNumberMethod.java
```

### 3. Run the program

```bash
java PrimeNumberMethod
```

The same process can be used for any standalone `.java` file.

---

## 📝 Example

For `PrimeNumberMethod.java`:

```text
Enter a number: 17
17 is a Prime Number
```

For `MultiplicationTableMethod.java`:

```text
Enter a number: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

## 📁 Repository Structure

```text
JAVA-programing/
│
├── GCD.java
├── LCM.java
├── CountDigits.java
├── SumOfDigits.java
├── SumOfDigitsMethod.java
├── PerfectNumber.java
├── PerfectNumberMethod.java
├── PrimeNumberMethod.java
├── MultiplicationTableMethod.java
├── LargestDigit.java
├── EvenOddMethod.java
├── LargestAmongThreeMethod.java
├── SumEvenDigits.java
├── ReverseNumber.java
├── ReverseAndSum.java
├── ArmstrongNumber.java
├── LargestNumber.java
├── FibonacciSeries.java
├── RepeatedDigits.java
├── RepeatedDigits1To100.java
├── Student.java
│
└── README.md
```

---

## 🎯 Learning Goals

The main goal of this repository is to improve:

- Java fundamentals
- Logical thinking
- Problem-solving ability
- Method-based programming
- OOP concepts
- DSA fundamentals
- Coding interview skills
- Time & space complexity understanding

---

## 🧪 Recommended Practice Approach

1. Read the problem.
2. Understand the expected output.
3. Build the logic on paper.
4. Try coding without looking at the solution.
5. Test with multiple inputs.
6. Check edge cases.
7. Understand the time and space complexity.
8. Only then compare with the solution.

> **Understand the logic — don't just memorize the code.**

---

## 👨‍💻 Author

**Neeraj Upadhayay**

GitHub: [@Neerajupadhayay2004](https://github.com/Neerajupadhayay2004)

---

## 📌 Status

🚧 **Actively maintained** — new Java programming and DSA problems will be added regularly.

---

### ⭐ If you're also learning Java

Clone the repository, pick a problem, try it yourself, and then compare your approach with the solution.

**Code → Practice → Understand → Improve. 💻🔥**
