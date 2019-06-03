package myPracticeAtHome;

public class FindMissingNumber {
	public static void main(String[] args) {
		int num[]=new int[] {1,2,3,4,5,6,8};
		//total = n*(n+1)/2
		int actual=0;
		int n=num.length+1;
		int total=n*(n+1)/2;
		for(int i=0; i<num.length;i++) {
			actual+=num[i];
		}System.out.println("missing number is: "+(total-actual));
		
		
	}

}
