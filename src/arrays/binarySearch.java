package arrays;

import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		int[] numbers= {2,4,5,3};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 4));
		System.out.println(Arrays.binarySearch(numbers, 3));
		System.out.println(Arrays.binarySearch(numbers, 5));
		System.out.println(Arrays.binarySearch(numbers, 10));
		
		
		
		
		
		}

}
