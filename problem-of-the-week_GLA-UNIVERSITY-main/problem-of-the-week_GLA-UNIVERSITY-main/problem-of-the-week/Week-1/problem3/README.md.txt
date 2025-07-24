🏠 Ruby Second House (Medium)
💡 Problem Statement
You are a construction manager overseeing the painting of a long row of houses. Each house must be painted using one of the available colors, and no two adjacent houses can have the same color.

Each painting option comes with a cost. Your task is to determine the minimum total cost required to paint all the houses while ensuring that no two adjacent houses are painted the same color.

📥 Input Format
The first line contains two integers:
n — the number of houses
k — the number of available colors

The next n lines each contain k space-separated integers.
Each integer represents the cost of painting the corresponding house with a specific color.

📤 Output Format
A single integer: the minimum total cost to paint all houses such that no two adjacent houses share the same color.

🔒 Constraints
1 ≤ n ≤ 100

2 ≤ k ≤ 20

1 ≤ costs[i][j] ≤ 20
(where costs[i][j] is the cost of painting house i with color j)

 Explanation
In the example, you have 2 houses and 3 color options.
The goal is to choose a color for each house such that:

The two houses do not have the same color.

The total cost is minimized.

One optimal solution is:

Paint house 0 with color 0 (cost = 1)

Paint house 1 with color 2 (cost = 4)
Total cost = 1 + 4 = 5

🧠 Approach
This problem is typically solved using Dynamic Programming.

Keep track of the minimum cost to paint each house with each color.

Make sure no two adjacent houses have the same color.

At each step, pick the minimum cost from the previous house's colors that are not the same as the current one.

The final answer will be the minimum cost of painting the last house.
