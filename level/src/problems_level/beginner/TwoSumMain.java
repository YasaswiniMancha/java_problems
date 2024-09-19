package problems_level.beginner;

import java.util.Scanner;

public class TwoSumMain {
    public static void main(String args[]) {
    	
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the array length: ");
    	int arrayLength= sc.nextInt();
    	int[] nums= new int[arrayLength];
    	System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrayLength ; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target :");
        int target=sc.nextInt();
        sc.close();
        
    	TwoSumSolution ts= new TwoSumSolution( );
    	ts.twoSum(nums, target);
    	
    	int[] result = ts.twoSum(nums, target);
    	System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
