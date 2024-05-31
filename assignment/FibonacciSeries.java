package assignment;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input for the desired range
        System.out.print("Enter the upper limit for the Fibonacci series: ");
        int upperLimit = scanner.nextInt();

        // Step 2: Initialize the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        // Step 3: Print the first Fibonacci number
        System.out.print("Fibonacci series: " + first);

        // Step 4: Use a loop to generate the Fibonacci series within the specified range
        while (second <= upperLimit) {
            System.out.print(", " + second);

            // Step 5: Update the Fibonacci numbers
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
