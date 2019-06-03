package myPracticeAtHome;

public class TheGrid {
	public static void main(String[] args) {
		
	/*	Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
				The string length will be at least 2.


				left2("Hello") → "lloHe"
				left2("java") → "vaja"
				left2("Hi") → "Hi"*/
	String l="hello";
	
	//Given an array of ints length 3, figure out which is larger, the first or last element in 
	//the array, and set all the other elements to be that value. Return the change
	
	System.out.println(l.substring(l.length()/2));
	int nums[]= {1,2,3};

	if(nums[0]>nums[2]){
	    nums[2]=nums[0]; nums[1]=nums[0];
	    
	    
	    
	 }else {
		 nums[0]=nums[2];nums[1]=nums[2];
	  }
	System.out.println(nums[2]);



		 
		
		
		
		
			
		
		
		
	}
	

}
