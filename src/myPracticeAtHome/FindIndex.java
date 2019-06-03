package myPracticeAtHome;

public class FindIndex {
	public static void main(String[] args) {
		String as[]=new String[] {"a","b","c","a"};
		for(int i=0; i<as.length;i++) {
			for( int b=i+1; b<as.length;b++) {
				if(as[i]==as[b]) {
					System.out.println(as[i]);
					
				}
			}
		}
			
		
        	
       
        
		
	}

}
