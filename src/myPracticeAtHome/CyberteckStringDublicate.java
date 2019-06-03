package myPracticeAtHome;

import java.util.Scanner;

public class CyberteckStringDublicate {
	public static void main(String[] args) {
		/**ask user to enter two words . 
		 * print the first word, second word, third word, first word
		 * Input
		 * one 
		 * two
		 * Output
		 * onetwotwoone
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("input the word");
		String input1=scanner.next();
		String input2=scanner.next();
		System.out.println(input1+input2+input2+input1);
		
	}

}
