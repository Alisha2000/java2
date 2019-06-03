package ArraysProject;

public class ProjectPractice7 {
	public static void main(String[]args) {
		/**
		 * Write a method that will accept array of integers as parameter
		 * and will return one long number of combined numbers.
		 * If the number is negative accept it as positive
		 * 
		 * For example:
		 * {2,66,3,90,1,-10} -> return int 266390110
		 * {0,34,5,3,8} -> return int 34538
		 * 
		 * @param array of numbers
		 * @return combined numbers of array
		 */
		int num[]=new int[] {2,66,3,90,1,-10};
		String result="";
		for(int i=0; i<num.length;i++) {
			result+=num[i];
		}
		result = result.replace("-", "");
		int n=Integer.parseInt(result);
		System.out.println(n);
		
	}
	
	

}
