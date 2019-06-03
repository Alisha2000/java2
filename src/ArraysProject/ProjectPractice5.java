

package ArraysProject;

import java.util.Arrays;

public class ProjectPractice5 {
	public static void main (String[] args) {
		/* * @param array of book pages
		 * @return page that is out of order; if all pages in the order return -1;
		 * 
		 * For example you given an array 
		 *  int[]pages={20,100,55,78,44,90}; -> method will return 55
		 *	int[]pages2={20,21,22,78,44,90};-> method will return 44
		 *  int[]pages3={20,21,22,78,84,90};-> method will return -1
		 */
		int[]pages=new int[] {20,21,22,78,90};
		//Arrays.sort(pages);
		//System.out.println(Arrays.toString(pages));
		int sum=-1;
		for(int i=0; i<pages.length-1; i++) {
			if(pages[i]>pages[i+1]) {
				sum = pages[i+1];	
			break;
			}
		}
	System.out.println(sum);
	}
	}


