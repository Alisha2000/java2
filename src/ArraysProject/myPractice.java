package ArraysProject;

import java.util.Arrays;

public class myPractice {
	public static void main(String[] args) {
		/**
		 * Given an array of integers, return indices of the two numbers,sum of which will be equal to a specific target number.
		 * You may assume that each input would have exactly one solution, 
		 * You can not use the same element twice.
		 * nums = [2, 7, 11, 15], target = 9, -> return [0, 1]
		 * nums = [5, 2, 4, 6, 3], target = 6, -> return [1, 2] 
		 * @param given an array of numbers nums
		 * @param target is a number sum of which you need to find
		 * @return an array of the indexes for the numbers from an array nums, sum of which will be equal to target
		 */
		int []nums = {2, 7, 11, 15};
		int target=9;
		for(int i=0; i<nums.length;i++) {
			for (int j=i+1; j<nums.length;j++)
			if(nums[i]+nums[j]==target) {
				System.out.println(nums[i]);
				System.out.println(nums[i+1]);
				Arrays.parallelSort(nums);
				System.out.println(Arrays.binarySearch(nums, 2));
				System.out.println(Arrays.binarySearch(nums,7));
				
				
				
				
			}
		}
		
		
	
			
		
		
	

	
	}

}
