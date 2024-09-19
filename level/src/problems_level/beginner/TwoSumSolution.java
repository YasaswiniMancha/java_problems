package problems_level.beginner;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
	

	public int[] twoSum(int[] nums, int target) { //8
	        // Create a HashMap to store the value and its index
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        // Loop through the array
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];   //9-2=7  
	            
	            // Check if the complement exists in the HashMap
	            if (map.containsKey(complement)) {  //7 is present
	                // Return the indices of the two numbers that add up to the target
	            	
	                return new int[] { map.get(complement), i };
	            }
	            
	            // Add the current number and its index to the HashMap
	            map.put(nums[i], i);
	        }
	        
	        // If no solution is found (though problem guarantees one), return an empty array
	        throw new IllegalArgumentException("No two sum solution");
	    }
}
