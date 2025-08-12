class Solution {
    public int findGCD(int[] nums) {
        // Initialize minNum to maximum possible value and maxNum to minimum possible value
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        // Find the smallest and largest numbers in the array
        for (int x : nums) {
            minNum = Math.min(minNum, x);
            maxNum = Math.max(maxNum, x);
        }

        // Return GCD of smallest and largest numbers
        return gcd(minNum, maxNum);
    }

    // Helper method to compute GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
