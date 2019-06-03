package arrays;

import java.util.Arrays;

public class HomeWork2 {
	public static void main(String[] args) {
		int[]numbers=new int[25];
		for(int i=0; i<25;i++) {
		numbers[i]=i;
		}System.out.println("This is array of int:"+Arrays.toString(numbers));
		
		int[] tempNumbers=Arrays.copyOf(numbers,  numbers.length);
		int[]emptyNumbers=new int[25];
		int n=0;
		for(int i=numbers.length-1; i>=0; i--) {
			emptyNumbers[n]=numbers[i];
			n++;
		}
		System.out.println("This is a reversed array of int: "+Arrays.toString(emptyNumbers));
	}

}
