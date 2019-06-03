package arrays;

import java.util.Arrays;

public class sortingArray {
	public static void main(String[] args) {
		int[] numbers= {99,12,2434,9989,1,43,454};
		System.out.println(numbers);


		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.binarySearch(numbers, 454)+" is index of 454");
		System.out.println(Arrays.binarySearch(numbers,2)+ " is index od 2");//negative possible index
		
		
		
	}

}
