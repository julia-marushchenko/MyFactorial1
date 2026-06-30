/**
 * Java program to calculate N!.
 */

package com.myfactorial;

/**
 * Main class..
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Calling method factorial(int n) for 11.
        int result = factorial(11);

        // Printing the result to console.
        System.out.println("11! = " + result); // Output: 39916800

        // Calling method factorial(int n) for 12.
        result = factorial(12);

        // Printing the result to console.
        System.out.println("12! = " + result); // Output: 479001600

        // Calling method factorial(int n) for 3.
        result = factorial(3);

        // Printing the result to console.
        System.out.println("3! = " + result); // Output: 6

        // Calling method factorial(int n) for 4.
        result = factorial(4);

        // Printing the result to console.
        System.out.println("4! = " + result); // Output: 24

        // Calling method factorial(int n) for 5.
        result = factorial(5);

        // Printing the result to console.
        System.out.println("5! = " + result); // Output: 120
    }

    // Method to calculate factorial for number N.
    public static int factorial(int n) {

        // For 0! result is 1.
        if(n == 0) {
            return 1;
        }

        // Calling factorial(int n) recursively.
        return n * factorial(n - 1);

    }
}