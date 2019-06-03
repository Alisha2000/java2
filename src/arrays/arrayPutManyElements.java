package arrays;

import java.util.Arrays;

public class arrayPutManyElements {
	public static void main(String[] args) {
		//put 100 elements in an array
		
		
		int [] numbers=new int[100];
		//numbers[0]=0;
		//numbers[1]=1;
		//numbers[99]=99;
		
		for (int i=0; i<100; i++) {
			numbers[i]=i;
			}
		System.out.println(Arrays.toString(numbers));
	}

}
