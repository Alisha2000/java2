package myPracticeAtHome;

import java.util.Scanner;

public class ProductsHomePractice {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String products[]= new String[] {"gum", "candy", "mars"};
		int price[]=new int[] {2,4,3};
		int pNumber[]=new int[]{10,11,12};
		System.out.println("please enter the product number: ");
		int pInput=scanner.nextInt();
		
		for(int i=0; i<pNumber.length;i++) {
			if(pInput==pNumber[i]) {
				System.out.println("please enter the : "+price[i]);
				int priceInput=scanner.nextInt();
				if(priceInput==price[i]) {
					System.out.println("enjoy your purchase");
				}
				
			}
		}
		
		
		

	
	}

}
