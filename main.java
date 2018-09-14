package P1voraces;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] c= {11,24,7,0,5,12,23,2,16,15}/*{9,2,11,13,14,12,17,3,1}*/;
		int[] f= {21,29,8,3,11,25,24,18,20,24}/*{10,10,13,20,15,16,20,9,2}*/;
		boolean[] sols= Voraz.selecActFinal(c, f);
		for(boolean sol:sols) {
			System.out.println(sol);
		}
	}

}
