package org.example;

public class Solution {

    /**
     * Counts the number of digits in the given number that are divisors of the original number.
     *
     * @param num The integer for which the divisors among its digits need to be counted.
     * @return The count of digits in the number that are divisors of the original number.
     */
    public int countDigits(int num) {
        // Make a copy of the input number for processing
        int tempNum = num;
        // Initialize the result counter
        int result = 0;

        // Loop through each digit of the number
        while (tempNum != 0) {
            // Get the rightmost digit of tempNum
            int n = tempNum % 10;

            // Check if the digit is a divisor of the original number
            if (num % n == 0) {
                result++;
            }

            // Move to the next digit by dividing tempNum by 10
            tempNum /= 10;
        }

        // Return the count of digits that are divisors
        return result;
    }
}
