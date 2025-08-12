🔍Find Greatest Common Divisor of Array 
This problem is about finding the Greatest Common Divisor (GCD) of the smallest and largest numbers in an array — a basic number theory problem that appears in competitive programming and interviews.

🧩 Problem Statement
You are given an integer array nums. Your task is to find the GCD of the smallest and largest numbers in the array.

🔒 Constraints
2 ≤ nums.length ≤ 1000

1 ≤ nums[i] ≤ 1000

🧠 Example
Input:
nums = [2, 5, 6, 9, 10]

Output:
2

Explanation:

Smallest number = 2

Largest number = 10

gcd(2, 10) = 2

✅ Approaches
1️⃣ Brute Force
🔧 Idea:
Find the minimum and maximum values in the array.

Check all numbers from 1 to min_value to find the largest divisor that divides both.

🧮 Time & Space:
Time Complexity: O(N + min_value) — O(N) to find min and max, O(min_value) to check divisors.

Space Complexity: O(1) — no extra storage needed.

🔍 When to use:
Small constraints where performance is not critical.

2️⃣ Euclidean Algorithm (Optimized)
🔧 Idea:
Find the smallest and largest numbers in the array.

Use the Euclidean Algorithm to find their GCD:

gcd(a, b) = gcd(b, a % b) until b becomes 0.

🧮 Time & Space:
Time Complexity: O(N + log(min_value)) — O(N) to find min/max, logarithmic for GCD.

Space Complexity: O(1)

🚀 When to use:
Always — this is the standard efficient way for GCD.

📊 Comparison Table
Approach	Time Complexity	Space Complexity	Best Use Case
Brute Force	O(N + min_value)	O(1)	Very small numbers
Euclidean Algorithm	O(N + log(min_value))	O(1)	Large inputs, fast results

🧪 Input Format
An integer N — number of elements in the array.

N space-separated integers — the array elements[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[A[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[A[A[A[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C
