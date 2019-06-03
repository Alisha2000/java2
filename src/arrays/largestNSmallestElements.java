package arrays;

public class largestNSmallestElements {
	public static void main(String[] args) {
		int[]numbers= {2,32,43,22,45,21,100,0};
		//for loop, if statements, assign new value to largestNumber if it is more than current
		int largestNumber=numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largestNumber) {
				largestNumber=numbers[i];
			}
		}System.out.println("The largest Element is: "+largestNumber);
			
		
		int smallestNumber=numbers[0];   
		for(int i=1; i<numbers.length; i++) {
		if(numbers[i]<smallestNumber) { 
			smallestNumber=numbers[i];         
		   }
		}System.out.println("The smallest element is: "+ smallestNumber);
			
		
	}

}
