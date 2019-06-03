package arrays;

public class ArrayIntro {
	public static void main(String[] args) {
		//I want to store 4, 109, 100000, 1, 54 in this array;
		/*int[] numbers =new int[5];
		numbers[0]=4;
		numbers[1]=109;
		numbers[4]=54;
		numbers[2]=100000;
		numbers[3]=1;
		System.out.println(numbers[0]);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(i);*/
		
		int[] numbers=new int[4];
		
		numbers[0]=23;
		numbers[1]=54;
		numbers[2]=98;
		numbers[3]=100;
		
		for(int i=0; i<numbers.length;i++) {
			if(i%2==1) {
				System.out.println(i+ "and" +numbers[i]);
			}
			
		//System.out.println("This is element of index at: " +i+ " and value is "+numbers[i]);
		
	
		
		}}

}
