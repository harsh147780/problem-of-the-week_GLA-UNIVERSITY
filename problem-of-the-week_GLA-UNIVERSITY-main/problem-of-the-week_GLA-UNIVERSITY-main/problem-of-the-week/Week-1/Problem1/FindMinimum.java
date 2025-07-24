// Bruteforce solution.

//Time Complexity: O(N) — We are looping through all N elements once.
//Space Complexity: O(1) — Constant extra space is used. No additional arrays or data structures are used.

import java.util.*;
public class MinInRotatedArrayBruteForce {
    public static int findMin(int[] arr, int n) {
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output the minimum element
        System.out.println(findMin(arr, n));
    }
}


//optimised solution using Binary search..

//Time Complexity: O(log N) — At each step, we reduce the search space by half using binary search.
//Space Complexity: O(1) — No extra data structures are used; only a few integer variables (low, high, mid).

import java.util.*;

public class MinInRotatedArray {
    public static int findMin(int[] arr, int n) {
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If middle element is greater than the rightmost, min is in the right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                // Min is in the left half including mid
                high = mid;
            }
        }

        // At the end, low == high and pointing to the minimum element
        return arr[low];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print the minimum
        System.out.println(findMin(arr, n));
    }
}
