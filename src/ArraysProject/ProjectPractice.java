package ArraysProject;

import java.util.Arrays;

public class ProjectPractice {
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
		int arrays[]=new int[] {3,9,55,99,2,10};
		int large=arrays[0];
		int length=arrays.length;
		/*for(int i=0; i<arrays.length; i++) {
			if(large<arrays[i]) {
				large=arrays[i];
			}
		}System.out.println(large);*/
		
		Arrays.sort(arrays);
		System.out.println(Arrays.toString(arrays));
		
		System.out.println(large=length-1);
	
		
		
		
		
		
	}


}
