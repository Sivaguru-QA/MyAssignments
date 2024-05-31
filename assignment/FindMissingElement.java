package assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
        // Step 1: Define the input array
        int[] array = {1, 4, 3, 2, 8, 6, 7};

        // Step 2: Sort the array
        Arrays.sort(array);

        // Step 3: Find and print the missing element
        int missingElement = findMissingElement(array);
        System.out.println("Missing Number: " + missingElement);
    }

    public static int findMissingElement(int[] array) {
        // Step 4: Loop through the array to find the missing element
        for (int i = 0; i < array.length; i++) {
            // The expected value should start from the first element (1 in this case)
            if (array[i] != i + 1) {
                // If the current value does not match the expected value, return the expected value
                return i + 1;
            }
        }

        // If no missing element is found in the loop, it means the missing element is the next number
        return array.length + 1;
    }
}