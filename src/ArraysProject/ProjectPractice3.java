package ArraysProject;

import java.util.Arrays;

public class ProjectPractice3 {
	public static void main(String[] args) {
		/**
		 * Write a method that will accept two array as parameters and return one new array
		 * will all values that have two arrays.
		 * 
		 * For Example: 
		 * first array: {"java", "code","fun","nine"}
		 * second array: {"hustle","until","get","a job"}
		 * -> return {"java", "code","fun","nine","hustle","until","get","a job"}
		 * 
		 * @param array of String
		 * @param array of String
		 * @return combined two arrays to one array
		 */
		String arr1[]=new String[] {"java","code","fun","nine"};
		String arr2[]=new String[] {"hustle","until","get","a job"};
		String sum[]=new String[arr1.length+arr2.length];
		
		// sum= {"java", "code", "fun", "nine", "hustle", "until"
		int count=0;
		for(int i=0; i<arr1.length; i++) {
			
			sum[i]=arr1[i];
			count++; //1 2 3 4			
		}
		//count  4
		//int cnt=arr1.length; 
		for(int j=0; j<arr2.length;j++) {
			sum[count++]=arr2[j];
		}
		
		for(int k=0; k<sum.length;k++) {
		System.out.print(sum[k]+" ");
		}
	
		
	}

}
