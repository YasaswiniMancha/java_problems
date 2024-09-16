package problems_level.beginner;

public class SumUpArrayElements {

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
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
        
        return results;
    }


public class Main {
    public static void main(String[] args) {
        // Create an instance of SumUpArrayElements
        SumUpArrayElements sm = new SumUpArrayElements();
        
        // Define an input array
        int[] nums = {2, 3, 4, 5, 6};
        
        // Call the runningSum method and pass the input array
        sm.runningSum(nums);
    }
   }
}
