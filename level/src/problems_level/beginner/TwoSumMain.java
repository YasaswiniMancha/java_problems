package problems_level.beginner;

import java.util.Scanner;

public class TwoSumMain {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int arrayLength = sc.nextInt();
		int[] nums = new int[arrayLength];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < arrayLength; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("enter the target :");
		int target = sc.nextInt();
		sc.close();

		TwoSumSolution ts = new TwoSumSolution();

		int[] result = ts.twoSumUsingHashMap(nums, target);
		System.out.println(" indices that sum up to get target (twoSumUsingHashMap): [" + result[0] + ", " + result[1] + "]");

		int[] resultWithBruteForce = ts.twoSumUsingBruteForce(nums, target);
		System.out.println(" indices that sum up to get target (twoSumUsingBruteForce): [" + resultWithBruteForce[0] + ", " + resultWithBruteForce[1] + "]");

		int[] resultWithTwoPointer = ts.twoSumUsingTwoPointer(nums, target);
		System.out.println(" indices that sum up to get target (twoSumUsingTwoPointer): [" + resultWithTwoPointer[0] + ", " + resultWithTwoPointer[1] + "]");

	}
}
