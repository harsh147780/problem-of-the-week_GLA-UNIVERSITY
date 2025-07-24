# 🔍 Min in Rotated Sorted Array

This problem focuses on finding the **minimum element in a rotated sorted array** — a common binary search-based algorithm question. It's useful in scenarios like update systems for autonomous vehicles, where data might be stored in a rotated form due to reboots.

---

## 🧩 Problem Statement

You're given an array that was initially sorted in **ascending order**, but then **rotated at an unknown pivot**. Your task is to find the **minimum element** in this array.

### 🔒 Constraints
- No duplicate elements
- 1 ≤ N ≤ 10⁵
- -10⁹ ≤ A[i] ≤ 10⁹
- Optimized solution should run in **O(log N)** time

---

## 🧠 Example

**Input:**
5
5 7 10 3 4


**Output:**
3


Explanation: The original sorted array could have been `[3, 4, 5, 7, 10]`. After rotating, the smallest element remains `3`.

---

## ✅ Approaches

### 1️⃣ Brute Force

#### 🔧 Idea:
- Traverse the entire array linearly.
- Compare each element to keep track of the minimum value.

#### 🧮 Time & Space:
- **Time Complexity:** O(N) — because we check every element.
- **Space Complexity:** O(1) — no extra space is needed.

#### 🔍 When to use:
- Simple to implement
- Works well for small input sizes

---

### 2️⃣ Binary Search (Optimized)

#### 🔧 Idea:
- Use a modified binary search to narrow down the search range.
- Check if the middle element is greater than the last — this helps decide if the minimum lies in the left or right half of the array.
- Continue shrinking the search range until you find the minimum.

#### 🧮 Time & Space:
- **Time Complexity:** O(log N) — efficient even for large arrays.
- **Space Complexity:** O(1) — only a few variables used.

#### 🚀 When to use:
- Large input sizes
- Performance-sensitive systems

---

## 📊 Comparison Table

| Approach        | Time Complexity | Space Complexity | Best Use Case         |
|----------------|------------------|-------------------|------------------------|
| Brute Force     | O(N)             | O(1)              | Small arrays, quick setup |
| Binary Search   | O(log N)         | O(1)              | Large arrays, optimized systems |

---

## 🧪 Input Format

1. First line: Integer `N` — the number of elements in the array.
2. Second line: `N` space-separated integers representing the rotated sorted array.

**Example:**
