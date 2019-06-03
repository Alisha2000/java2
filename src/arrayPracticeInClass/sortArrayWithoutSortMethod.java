package arrayPracticeInClass;

import java.util.Arrays;

public class sortArrayWithoutSortMethod {
	public static void main(String[] args) {
		int[]sortNumber= {9,8,6,5,7,3,1};
	
		for(int i=0; i<sortNumber.length;i++) {
		for(int k=i+1; k<sortNumber.length;k++) {
			int temp=0;
			if(sortNumber[i]>sortNumber[k]) {//9>8, tdemp=9; 9=8; 8=temp//9>6;temp=9;9=6;6=temp//9>5;
				temp=sortNumber[i]; //temp=9
				sortNumber[i]=sortNumber[k]; //8,8,6,4,5,7,3,1
				sortNumber[k]=temp;//8,9,6,4,5,
				//sorting
				//merge sorting				
			}
			
		}
		}
		System.out.println(Arrays.toString(sortNumber));
		
	}

}
