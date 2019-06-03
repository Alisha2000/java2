package arrayPracticeInClass;

public class age {
	public static void main(String[] args) {
		int age[][]=new int[4][3];
		
		age[0][0]=18;
		age[0][1]=21;
		age[0][2]=19;
		
		age[1][0]=22;
		age[1][1]=30;
		age[1][2]=24;
		
		age[2][0]=17;
		age[2][1]=28;
		age[2][2]=23;//24,33/31
		
		age[3][0]=24;
		age[3][1]=33;
		age[3][2]=31;
		for(int i=0; i<age.length; i++) {
			for(int y=0; y<age[i].length; y++) {
				System.out.println(i+"+"+y +",");
			}
		}
		
		
	}

}
