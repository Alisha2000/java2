package arrays;

public class stringArrays {
	public static void main(String[] args) {
		String[] names=new String[5];
		names[0]="Dmytro";
		names[1]="Kuttubek";
		names[2]="Mehmet";
		names[3]="Enes";
		names[4]="Asiyat";
		
		for(int index=0; index<names.length; index++) {
			System.out.println(names[index]);
		}
		System.out.println("------------------------------------");
		// For Each Loop
		for(String n: names) {
			System.out.println(n);
		}
	}

}
