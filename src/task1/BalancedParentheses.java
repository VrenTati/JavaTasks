package task1;

import java.util.Scanner;

/**
 * This problem is solved using the Catalan formula,
 * which displays the number of ways to correctly place parentheses
 */
public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (number of pairs of parentheses): ");
        int n = scanner.nextInt();
        System.out.println("Number of valid parentheses expressions: " + catalanNumber(n));

        scanner.close();
    }

    /**
     * Calculates the n-th Catalan number, which represents the count of valid parentheses combinations.
     * Formula: C(n) = (2n)! / ((n+1)! * n!)
     *
     * @param n number of pairs of parentheses
     * @return number of valid parentheses expressions
     */
    public static long catalanNumber(int n) {
        if (n == 0) return 1;

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = 0;

            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }
}
