package arrayPracticeInClass;

public class MissingNumber {
	public static void main(String[] args) {
		//write the code to find missing number from array
		//to find the sum of the n number.
		
		int num[]=new int[] {1,2,3,4,7,6,9,8};//n*(n+1)/2
		int n=num.length+1;
		int actual=0;
		int total=n*(n+1)/2;
		for(int i=0;i<num.length;i++) {
			actual+=num[i];
		}System.out.println("missing number is: "+(total-actual));
			
		
		
		
		
		
		
	
	}

}