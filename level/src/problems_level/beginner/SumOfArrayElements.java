package problems_level.beginner;

public class SumOfArrayElements {

    // Method to calculate the running sum of an array
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            // Ensure no negative index is accessed
            if (i == 0) {
                results[i] = nums[i];  // First element is the same
            } else {
                results[i] = nums[i] + results[i - 1];  // Add previous result
            }
        }
        
        // Display the results
        System.out.println("results array: ");
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
        
        return results;
    }

}
