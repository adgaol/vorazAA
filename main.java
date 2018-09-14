package P1voraces;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] c= {9,2,11,13,14,12,17,3,1};
		int[] f= {10,10,13,20,15,16,20,9,2};
		boolean[] sols= Voraz.selecActFinal(c, f);
		for(boolean sol:sols) {
			System.out.println(sol);
		}
	}

}
