import java.util.*;

public class RubySecondHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of houses
        int k = sc.nextInt(); // number of colors

        int[][] costs = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                costs[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][k];
        // Base case: first row is the same as cost
        for (int j = 0; j < k; j++) {
            dp[0][j] = costs[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int c = 0; c < k; c++) {
                    if (c != j) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][c] + costs[i][j]);
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            result = Math.min(result, dp[n - 1][j]);
        }

        System.out.println(result);
    }
}
