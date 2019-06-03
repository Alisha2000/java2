package arrays;

import java.util.Scanner;
public class LapTimes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your favorite foods: ");
		String food[]=new String[3];
		for(int i=0; i<food.length;i++) {
			System.out.println("your favorite food is: "+(i+1));
			String n=scanner.next();
		}
		System.out.println("No more memory available");
		for(int i=0; i<food.length;i++) {
			
			System.out.println(food[i]);
		}
		
			
		
		
	
		
		
		
		
		

}
}