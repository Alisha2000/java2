package arrays;

public class MultiDArray {
	public static void main(String[] args) {
		String [][]techtorial0toHeroGroup=new String[4][];
		techtorial0toHeroGroup[0]=new String[] {"Kuttubek", "Maiia","Enes","Kuba","Eliza"};
		techtorial0toHeroGroup[1]=new String[] {"Ayzada","Azzia","Marat", "Asiyat","Dan","Mehmet"};
		techtorial0toHeroGroup[2]=new String[] {"Ruslan", "Kanybek", "Saltanat","Aizat","Asli","Ulan"};
		techtorial0toHeroGroup[3]=new String[] {};
		
		for(int i=0; i<techtorial0toHeroGroup[2].length;i++){
			if(techtorial0toHeroGroup[2][i].equals("Ulan")){
		System.out.println(techtorial0toHeroGroup[2][i]);
		}
		
	    }for(int i=0; i<techtorial0toHeroGroup[1].length;i++) {
	    	if(techtorial0toHeroGroup[1][i].equals("Asiyat")) {
	    }System.out.println(techtorial0toHeroGroup[1][i]);
	}
	
}

}
