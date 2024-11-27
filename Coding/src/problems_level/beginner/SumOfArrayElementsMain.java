package problems_level.beginner;

import java.util.Scanner;

public class SumOfArrayElementsMain {

    public static void main(String[] args) {
        // Create an instance of SumUpArrayElements
        SumOfArrayElements sm = new SumOfArrayElements();

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array with the given size
        int[] nums = new int[n];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the runningSum method and pass the input array
        sm.runningSum(nums);
        sm.runningSumWithOverrideMethod(nums);

        // Close the scanner to avoid resource leakage
        scanner.close();
    }
}
