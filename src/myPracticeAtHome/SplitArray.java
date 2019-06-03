package myPracticeAtHome;

import java.util.Arrays;

public class SplitArray {
	public static void main(String[] args) {
		String words="I learn Java every day";
		String str[]=words.split(" ",5);
		for(String temp:str) {
			System.out.println(temp);
		}
	}

}
