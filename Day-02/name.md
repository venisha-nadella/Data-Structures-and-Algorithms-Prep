# Day 02 – Arrays (Basics)

## 🔹 What is an Array?

An **array** is a collection of elements of the **same data type** stored in **continuous (contiguous) memory locations**.

- Each element is accessed using an **index**
- In Java, indexing starts from **0**
- Size of an array is **fixed**

### Example (Java)
```java
int[] arr = {10, 20, 30, 40};

---

## 🔹 Key Characteristics of an Array
- Fixed size
- Stores elements of the same data type
- Fast access to elements
- Index-based data structure
- Stored in contiguous memory locations

---

## 🔹 How is an Array Stored in Memory?

Arrays are stored in **contiguous memory locations**, meaning all elements are placed next to each other in memory.

### Example
```java
int[] arr = {5, 10, 15};

---

## 🧠 Memory Representation of an Array

Assume:
- Data type: `int`
- Size of `int` = **4 bytes**
- Base address of array = **1000**

| Index | Address | Value |
|------|--------|------|
| 0 | 1000 | 5 |
| 1 | 1004 | 10 |
| 2 | 1008 | 15 |

➡ Each element is stored **4 bytes apart** because an `int` occupies 4 bytes.

---

# How is an Array Accessed?

Arrays are accessed using an **index**.  
Each index directly maps to a memory location.

---

## 📐 Address Calculation Formula (Important for Interviews)


- `Base_Address` → address of the first element (`arr[0]`)
- `i` → index of the element
- `size_of_data_type` → memory size of one element (e.g., 4 bytes for `int`)

👉 Because of this direct calculation, **array access takes constant time**.

---

## 🔹 Example (Java)

```java
int[] arr = {10, 20, 30, 40};
int x = arr[2];   // Direct access

---
# 🧩 Problems Practiced

1. Print all elements of an array  
2. Find sum of elements  
3. Find maximum element  
4. Find minimum element  
5. Count even numbers  
6. Count odd numbers  
7. Count positive, negative, and zero elements  
8. Find average of elements  
9. Copy one array into another  
10. Linear search (find element index)  
11. Check if an element exists  
12. Count occurrences of an element  
13. Find first occurrence of an element  
14. Find last occurrence of an element  
