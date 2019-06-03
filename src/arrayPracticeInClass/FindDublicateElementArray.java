package arrayPracticeInClass;

import java.util.Arrays;
//find dublicate element in aray

public class FindDublicateElementArray {
	public static void main(String[] args) {
		
	
	int[]sAge= {9,8,6,5,5,7,3,1};
	for(int i=0; i<sAge.length; i++) {
		for(int y=i+1; y<sAge.length;y++) {
			if(sAge[i]==sAge[y]) {
				System.out.println("dublicate is: "+sAge[y]);
			}
		}
	


	}

}
}