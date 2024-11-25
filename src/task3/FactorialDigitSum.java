package task3;

import java.math.BigInteger;

public class FactorialDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of digits in 100!: " + sumOfDigits(factorial(100)));
    }

    /**
     * Computes the factorial of a number.
     *
     * @param n the number to compute the factorial of
     * @return the factorial as a BigInteger
     */
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    /**
     * Computes the sum of the digits of a BigInteger.
     *
     * @param number the BigInteger to sum digits of
     * @return the sum of its digits
     */
    public static int sumOfDigits(BigInteger number) {
        String numString = number.toString();
        int sum = 0;

        for (char digit : numString.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }
}
