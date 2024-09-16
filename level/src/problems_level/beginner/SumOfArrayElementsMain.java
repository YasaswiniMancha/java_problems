package problems_level.beginner;

public class SumOfArrayElementsMain {

	public static void main(String[] args) {
		// Create an instance of SumUpArrayElements
		SumOfArrayElements sm = new SumOfArrayElements();

		// Define an input array
		int[] nums = { 2, 3, 4, 5, 6 };

		// Call the runningSum method and pass the input array
		sm.runningSum(nums);
		sm.runningSumWithOverrideMethod(nums);
	}
}
