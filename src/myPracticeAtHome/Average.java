package myPracticeAtHome;

public class Average {
	public static void main(String[] args) {
		//Write a Java program to calculate the average value of array elements
		int num[]=new int[] {1,4,5,6};
		int sum=0;
		int count=0;
		int sumOffOdd=0;
		
		for(int i=0; i<num.length;i++) {
			if(num[i]%2==1) {
				sumOffOdd+=num[i];				
				count++;
				
		}
	}System.out.println("average of odd numbers is:"+sumOffOdd/count);
		
		/*int[]sAge= {9,8,6,5,5,7,3,1};
		for(int i=0; i<sAge.length;i++) {
			for(int j=i+1; j<sAge.length;j++) {
				if(sAge[i]==sAge[j]) {
					System.out.println(sAge[i]);*/
				
			
		
	}

}
