package arrays;

import java.util.Arrays;

public class neth {
	public static void main(String[] args) {
		double array[]= new double[200];
		int index=0;
		int sum=0;
		for(int i=0; i<200; i++) {
			if(i%2==0) {
				array[index]=i;
				sum+=array[index];
				index++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("our index num is "+index);
		System.out.println("our sum is: "+ sum);
		System.out.println(sum/index);
	}
}
