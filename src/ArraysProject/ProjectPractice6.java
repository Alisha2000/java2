package ArraysProject;

import java.util.Arrays;

public class ProjectPractice6 {
		/**
		  * 
	 	  * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion. 
		  * Your method should switch the order of the first two values, 
		  * then switch the order of the next two, switch the order of the next two, and so on. 
		  * 
		  * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
		  * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
		  *  
		  * Method that is using String[]
		  * @param Array
		  * @return switched pairs list
		  */
	//public static String[] switchPairs(String arr[]) {
		//String newArr[]=new String[arr.length];		
		//for(int a=0, b=1; b<arr.length-1; a+=2, b+=2 ) {
			//newArr[arr.length-1]+=arr[b+a];	
			
		//}
		//return newArr;
	//}
		public static void main(String[] args) {
			String []num1={"four", "score", "and", "seven", "years", "ago"};
			//switchPairs(num1);
			String newArr[]=new String[num1.length];
			for(int a=0,b=1;b<num1.length; a+=2,b+=2) {
				newArr[a]=num1[b];
				newArr[b]=num1[a];
			}
			System.out.println(Arrays.toString(newArr));
		}
	
			
			
			
			
			
			
			
		
		
		
		
	

}
