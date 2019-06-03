package arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		String words[][]=new String[4][];
		words[0]= new String[] {"dog", "cats", "bears"};
		words[1]=new String[]{"chickens","parrots"};
		words[2]=new String[] {"snakes", "scorpions","mice"};
		words[3]=new String[] {"sharks", "dolphins", "whale"};
		for(int i=0; i<words.length;i++) {
			for(int y=0; y<words[i].length; y++) {
				System.out.print(words[i][y]+", ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
