
# Array Basics in Java — Examples and Mini Project

## Overview

This repo contains a set of small Java examples that demonstrate how arrays work in Java and a mini project called **Student Marks Analyzer**. You will see how to declare arrays, traverse them, insert values (with and without shifting), delete values, copy arrays, and search values. The mini project reads student marks and performs average, min, max, and search.

## Why arrays

* Store multiple values of the same type in one variable
* Fast random access with indexes (O(1))
* Foundation for lists, matrices, heaps, and more

## Core concepts

* **Homogeneous**: all elements share the same type
* **Fixed size**: size is set at creation
* **Index based**: zero-based indexing
* **Contiguous memory**: elements live next to each other

## Real-life analogy

Think of a row of lockers. Each locker has a number (index). You can jump to a locker in constant time. Inserting a new locker in the middle means shifting the rest.

---

## Operations covered

### 1) Declaration, allocation, initialization, traversal

```java
int[] testArr = new int[5];      // allocation with default values (0)
testArr[0] = 1; testArr[1] = 2; testArr[2] = 3;

for (int i = 0; i < testArr.length; i++) {
    System.out.println("testArr[" + i + "] = " + testArr[i]);
}

int[] marks = {85, 90, 78, 88, 76};
for (int i = 0; i < marks.length; i++) {
    System.out.println("marks[" + i + "] = " + marks[i]);
}
```

### 2) Insert or update a value in place

```java
int[] marks = {85, 90, 78, 88, 76};
int indexNo = 2;
int a = 10;               // replace marks[2] with 10
marks[indexNo] = a;
```

### 3) Insert by shifting (when free space exists inside the same array)

```java
// Assume testArr has extra capacity, and indexShift is the target index
for (int i = testArr.length - 1; i > indexShift; i--) {
    testArr[i] = testArr[i - 1];
}
testArr[indexShift] = /* new value */ ;
```

### 4) Insert by creating a larger array (when array is full)

```java
// Step 1: create new array
int[] newArray = new int[marks.length + 1];

// Step 2: copy elements before indexShift
System.arraycopy(marks, 0, newArray, 0, indexShift);

// Step 3: insert new value
newArray[indexShift] = /* new value */ ;

// Step 4: copy remaining elements
System.arraycopy(marks, indexShift, newArray, indexShift + 1, marks.length - indexShift);

System.out.println(java.util.Arrays.toString(newArray));
```

### 5) Delete by left shift

```java
int delInd = 2; // delete element at index 2
for (int i = delInd; i < testArr.length - 1; i++) {
    testArr[i] = testArr[i + 1];
}
// Optionally track a logical size to ignore the last slot
```

### 6) Copy an array

```java
// Loop
int[] copy1 = new int[marks.length];
for (int i = 0; i < marks.length; i++) copy1[i] = marks[i];

// System.arraycopy
int[] copy2 = new int[marks.length];
System.arraycopy(marks, 0, copy2, 0, marks.length);

// Arrays.copyOf
int[] copy3 = java.util.Arrays.copyOf(marks, marks.length);

// clone
int[] copy4 = marks.clone();
```

### 7) Search in an array

```java
int value1 = 88;
boolean found = false;
for (int i = 0; i < marks.length; i++) {
    if (marks[i] == value1) {
        System.out.println("value1 found at index: " + i);
        found = true;
        break;
    }
}
if (!found) System.out.println("Value not found");
```

---

## Mini project: Student Marks Analyzer

**Scenario**
A teacher wants a quick way to analyze student marks. The program stores marks in an array, calculates average, highest, and lowest, and lets the teacher search for a specific score.

**Code**

```java
package linearDS.array_ds;

import java.util.Scanner;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Create array and read marks
        int[] marks = new int[n];
        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Calculate sum, average, highest, lowest
        int sum = 0, highest = marks[0], lowest = marks[0];
        for (int i = 0; i < n; i++) {
            sum += marks[i];
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest)  lowest  = marks[i];
        }
        double avg = (double) sum / n;

        // Show analysis
        System.out.println("\n--- Result Analysis ---");
        System.out.println("Average Marks: " + avg);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        // Search
        System.out.print("\nEnter a mark to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int mark : marks) {
            if (mark == search) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Mark " + search + " found in the list.");
        else       System.out.println("Mark " + search + " not found.");

        sc.close();
    }
}
```

**Sample run**

```
Enter number of students: 5
Enter marks of 5 students:
70 85 90 65 80

--- Result Analysis ---
Average Marks: 78.0
Highest Marks: 90
Lowest Marks: 65

Enter a mark to search: 85
Mark 85 found in the list.
```

---

### Using IntelliJ IDEA

1. Create a new Java project and set language level to your JDK version
2. Create the package `linearDS.array_ds`
3. Add `StudentMarksAnalyzer.java` inside it
4. Run the file (Shift+F10 by default)

---

## Complexity notes

* Access by index: O(1)
* Update by index: O(1)
* Insert or delete at arbitrary index: O(n) due to shifting
* Linear search: O(n)
* Binary search: O(log n) on a sorted array

---

# String Basics in Java | Data Structure Series

This project demonstrates the **fundamental operations of Strings in Java**.  
It is part of my **Data Structures in Java (Bangla Tutorial Series)**.  

## 📌 Topics Covered
- Declaring and initializing Strings
- Concatenation (`concat`)
- Length of a String (`length()`)
- Accessing characters (`charAt()`)
- Substring (`substring()`)
- String comparison (`equals`, `equalsIgnoreCase`)
- Searching (`contains`, `indexOf`, `lastIndexOf`)
- Replacing (`replace`)
- Converting case (`toUpperCase`, `toLowerCase`)
- Trimming (`trim`)
- Splitting (`split`)

## 🚀 Run the Program
```bash
javac StringBasics.java
java StringBasics

