package myPracticeAtHome;

public class SumValuesOfArray {
	public static void main(String[] args) {
		//Write a Java program to sum values of an array. 
		int numbers[]=new int[]{45,87,23,12};
		int sum=0;
		for(int i=0; i<numbers.length;i++) {
			sum+=numbers[i];
			
		}System.out.println(sum);
		
	}

}
