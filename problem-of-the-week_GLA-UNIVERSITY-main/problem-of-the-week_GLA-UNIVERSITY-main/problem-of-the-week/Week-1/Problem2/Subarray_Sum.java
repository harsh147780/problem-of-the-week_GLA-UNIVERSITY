//Brruteforce solution using nested loop

import java.util.*;

public class SubarraySumBruteForce {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(subarraySum(nums, k));
    }
}


//best solution using Prifixsum+HashMap 

import java.util.*;

public class SubarraySumOptimized {
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: prefix sum 0 occurs once

        for (int num : nums) {
            sum += num;

            // Check if (sum - k) prefix exists
            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }

            // Update prefix sums count
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(subarraySum(nums, k));
    }
}
