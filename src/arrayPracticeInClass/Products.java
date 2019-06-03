package arrayPracticeInClass;

import java.util.Scanner;

public class Products {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String productName[]=new String[] {"tablerone","sneakers","lays","ruffles","cookies","pepsi","m&m","fanta","7up"};
		int productNumber[]=new int[] {1,2,3,4,5,6,7,8,9};
		int productPrice[]=new int[] {3,4,5,6,7,8,9,10,11};
		System.out.println("Please enter the product number");
		int pNumber=scanner.nextInt();
		
		for(int i=0; i<productNumber.length; i++) {
			if(pNumber==productNumber[i]){
				System.out.println("please enter th e product price "+productPrice[i]);
				int pPrice=scanner.nextInt();
				if(pPrice==productPrice[i]) {
					System.out.println("please enjoy with the "+productName[i]);
					
				}else {
					System.out.println("please try again");
				}
				
			  }
		
		}
			
		}
}
