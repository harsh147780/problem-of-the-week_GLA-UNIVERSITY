# 🔥 Subarray Sum Equals K

You are analyzing calorie data from users of a fitness app. Each user logs their daily calorie burn, and your task is to find how many **continuous day streaks (subarrays)** add up to a given calorie **target `k`**. This helps identify goal-based user streaks.

---

## 🧩 Problem Statement

Given an integer array representing calories burned each day (`nums`), and a target calorie goal `k`, return the number of **continuous subarrays** whose sum equals `k`.

---

## 📥 Input Format

- An integer `n` — number of days (length of the array).
- An array `nums` of `n` integers — calories burned each day.
- An integer `k` — the target calorie goal.

---

## 📤 Output Format

- A single integer — number of continuous subarrays whose sum equals `k`.

---

## 🔒 Constraints

- 1 ≤ nums.length ≤ 20,000  
- -1000 ≤ nums[i] ≤ 1000  
- -10⁷ ≤ k ≤ 10⁷  

---

## 🧠 Examples

### Example 1:
**Input:**
nums = [1, 2, 3]
k = 3


**Output:**
2
**Explanation:**
- Subarrays `[1, 2]` and `[3]` sum to `3`.

## ✅ Approaches

### 1️⃣ Brute Force (Two Nested Loops)

#### 🔧 Idea:
- Use two nested loops to consider all possible subarrays.
- For each subarray, calculate the sum and check if it equals `k`.

#### 🧮 Time & Space:
- **Time Complexity:** O(n²) — due to nested loops  
- **Space Complexity:** O(1) — only basic variables used

#### 🚦 When to Use:
- Small arrays
- Simple implementation is acceptable

---

### 2️⃣ Optimized Approach — Prefix Sum + HashMap

#### 🔧 Idea:
- Use a variable `sum` to keep track of the running sum.
- Use a HashMap to store how many times each prefix sum has occurred.
- At each step, check if `sum - k` exists in the map.
  - If it does, it means there’s a subarray ending at the current index which sums to `k`.

#### 📌 Key Insight:
- If `sum(i to j) = sum(j) - sum(i-1)`
- Then to find subarrays ending at index `j` with sum = `k`, we look for `(sum - k)` in the map.

#### 🧮 Time & Space:
- **Time Complexity:** O(n) — linear pass through the array
- **Space Complexity:** O(n) — storing prefix sums in the map

#### 🚀 When to Use:
- Larger arrays
- Real-time or performance-sensitive analysis

---

## 📊 Comparison Table

| Approach                  | Time Complexity | Space Complexity | Best Use Case          |
|---------------------------|------------------|-------------------|-------------------------|
| Brute Force               | O(n²)            | O(1)              | Small inputs, simple logic |
| Prefix Sum + HashMap      | O(n)             | O(n)              | Large inputs, efficient solution |

---
