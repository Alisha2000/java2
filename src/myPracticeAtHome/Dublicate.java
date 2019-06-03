package myPracticeAtHome;

import java.util.Arrays;

public class Dublicate {
	public static void main(String[] args) {
		/**
		 * Write a method that will accept an array as parameter
		 * and return max value from array.
		 * 
		 * for example:
		 * {3,9,55,73,99,2,10} -> return 99
		 * 
		 * @param arrays of numbers
		 * @return maximum value from array 
		 */
		
		int arr[]={3,9,55,73,99,2,10};
	   /* int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}*/
		//System.out.println(max);
		
		Arrays.parallelSort(arr);	
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
			
	}
		
	

}
