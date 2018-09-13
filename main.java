package practica1;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] c= {9,11,14,12,17};
		int[] f= {10,13,15,16,20};
		boolean[] sols= Voraz.selecActividades (c,f);
		for(boolean sol:sols) {
			System.out.println(sol);
		}
	}

}
