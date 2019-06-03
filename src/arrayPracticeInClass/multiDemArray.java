package arrayPracticeInClass;

public class multiDemArray {
	public static void main(String[] args) {
		String students[][]=new String[3][2];
		students[0][0]= "Aidana";
		students[0][1]="Enes";
		students[1][0]="Kanybek";
		students[1][1]="Ruslan";
		students[2][0]="Muammer";
		students[2][1]="Tima";
		for(int i=0; i<students.length;i++) {
			for( int y=0; y<students[i].length;y++) {
				System.out.println(students[i][y]);
			
			}
		}
				
	}
		
		
		
		
	

}
