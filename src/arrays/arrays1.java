package arrays;

public class arrays1 {
	public static void main(String[] args) {
		int[] numbers=new int[3];
		numbers[0]=5;
		numbers[1]=10;
		numbers[2]=20;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		                  //index:0,1,2,3
		int[] numbers2=new int[] {1,2,3,4};
		System.out.println(numbers2[0]);
		System.out.println(numbers2[3]);
		
		
		System.out.println("------------------------");
		int numbers3[]=new int[5];//by default all values are 0
		System.out.println(numbers3[4]);
	}

}
