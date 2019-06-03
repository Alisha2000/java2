package arrayPracticeInClass;

import java.util.Arrays;

public class arrayPractice {
	public static void main(String[] args) {
	/*	int intArray[];
		int[]arr1;
		int[][] num,num1;
		//num is a multidimentional array. However num1 just only int primitive.
		
		int [][]num2;
		int[][]num3;
		//num2 is multidimentional array however num3 is one array.
		num3= new int[2][3];
		
		arr1=new int[7];
		arr1=new int[10];*/
		
		
		//create one multidimentional array of grocery items. indexes are 2 and 3.
		//for first array give the value apple
		String grocery[][]=new String[2][3];
		grocery[0][0]= "apple";
		grocery[0][1]="banana";
		grocery[0][2]="strawberry";
		grocery[1][0]="bread";
		grocery[1][1]="cheese";
		grocery[1][2]="lettice";
		String[][] grocery1= {{"apple","banana", "strawberry"}, {"bread", "cheese", "lettice"}};
		for(int i=0; i<grocery.length;i++) {
			for(int y=0; y<grocery[i].length;y++) {
				System.out.println(grocery[i][y]);
				
		int[]tableNumber=new int[1]	;
		System.out.println(tableNumber.toString());
		System.out.println(Arrays.toString(tableNumber));//will print values
		int[] studentNumber= {4,3,2,3};
		System.out.println(Arrays.toString(studentNumber));
		String[] stateName= {"IL","California","Wisconsin"};
		Arrays.parallelSort(stateName);
		System.out.println(Arrays.toString(stateName));
		
		String [] stateName1= {"101","1001","900"};
		Arrays.parallelSort(stateName1);
		System.out.println(Arrays.toString(stateName1));
		String [] state3=stateName1;
		System.out.println(state3.equals(stateName1));
		
		int [] sNumber= {4,3,6,10,7};
		Arrays.sort(sNumber);
		System.out.println(Arrays.binarySearch(sNumber,4));
		//if the array element is not available inside the array. 
		//the binary search will return the possible location of the value with added -1
		
		int sum=0;
		int num[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int c=0; c<num.length; c++ ){
			for(int z=c+1; z<num.length; z++) {
				if(num[c]+num[z]==16) {
				System.out.println(num[c]+" "+num[z]);
				}
			}
		}
		
		
		
				
		
				
				
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
	}

}
