package arrays;

import java.util.Arrays;

public class homeWork {
	public static void main(String[] args) {
		
		double numbers[]=new double[200];
		
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=i;
		}System.out.println(Arrays.toString(numbers));
		
		double sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
			
		}System.out.println("Sum of all elements: "+sum);
		
		double sumOfEven=0;
		int count=0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2==0) {
				sumOfEven+=numbers[i];
				count++;
			}
			
		}System.out.println("Sum of even elements is: "+sumOfEven);
		System.out.println(count);
		
		
		System.out.println("Average of all elements is: "+sum/count );
		
		/*double sumOfOdd=0;
		
		int count=0;
	
		for (int i=0; i<numbers.length; i++) {
			count++;
			
			if(i%2!=0) {
				
				sumOfOdd+=i;
				
			}
		}System.out.println("Average of odd numbers is: "+ sumOfOdd/count;*/
		
		
		double smallestNumber=210;
		for(int i=numbers.length-1; i>=0; i--) {
			double currentNum=numbers[i];
		if(currentNum<smallestNumber) {
			smallestNumber=currentNum;
		   }
		}System.out.println("The smallest element is: "+ smallestNumber);
			
			
			
		double largestNumber=-1;
		for(int i=0; i<numbers.length; i++) {
			double currentNumber=numbers[i];
			if(currentNumber>largestNumber) {
				largestNumber=currentNumber;
			}
		}System.out.println("The largest Element is: "+largestNumber);
			
				
		
		
		
		
		
					
			
		
			
		
	
		
		
		
		
		
		
		

		
		
	}

}
