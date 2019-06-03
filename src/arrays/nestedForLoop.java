package arrays;

public class nestedForLoop {
	public static void main(String[] args) {
		String [][]techtorial0toHeroGroup=new String[4][];
		techtorial0toHeroGroup[0]=new String[] {"Kuttubek", "Maiia","Enes","Kuba","Eliza"};
		techtorial0toHeroGroup[1]=new String[] {"Ayzada","Azzia","Marat", "Asiyat","Dan","Mehmet"};
		techtorial0toHeroGroup[2]=new String[] {"Ruslan", "Kanybek", "Saltanat","Aizat","Asli","Ulan"};
		techtorial0toHeroGroup[3]=new String[] {};
		
		for(int i=0; i<techtorial0toHeroGroup.length;i++){
			for(int y=0; y<techtorial0toHeroGroup[i].length;y++ ) {
			System.out.println(techtorial0toHeroGroup[i][y]);
			
			}System.out.println();
		}
}
	}
