package arrays;

public class ArraysAdv {
	public static void main(String[] args) {
		//String[] arr=new String[10];
		String num[]=new String[5];
		num[0]="hi";
		num[1]="bye";
		num[2]="wow";
		num[3]="yes";
		
		for(int i=num.length-1; i>0;i--) {
			if(num[i]==null) {
				System.out.println(i);
				
			}
			
			
			//System.out.println(i);
		}
		
		
	
		
	}

}
