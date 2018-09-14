package P1voraces;

import java.util.ArrayList;
import java.util.LinkedList;

public class Voraz {
	public static boolean[] selecActividades (int[] c, int[] f) {
		 boolean[] s = new boolean[c.length];
		 s[0] = true;
		 int i = 0;
		 for (int j=1; j<c.length; j++) {
			 if ( f[i]<c[j]) {
				 s[j] = true;
				 i = j;
			 }
			 else
				 s[j] = false;
		 	}
		 return s;
		 } 
	public static int[] ordenarEnIndices (int[] f) {
		 int[] aux = new int[f.length];
		 aux[0] = 0;
		 for (int i=1; i<f.length; i++) {
		 int aux1 = f[i];
		 int j;
		 for (j=i-1; j>=0 && f[aux[j]]>aux1; j--)
		 aux[j+1] = aux[j];
		 aux[j+1] = i;
		 }
		 return aux;
		 } 
	public static LinkedList<Integer> selecActFinal(int[] c,int[] f){
		 int[] aux = ordenarEnIndices(f);						//ordenamos los indice por hora de fin de actividad		 
		 LinkedList<Integer> s = new LinkedList<Integer>();	    //creamos la lista en el que introduciremos las soluciones
		 int i = 0;								
		 s.add(0,aux[0]);
		 for (int j=1; j<c.length; j++) {
			 if ( f[aux[i]]<c[aux[j]]) {
				 s.addLast(aux[j]);
				 i = j;
			 }

	     }
		 return s;
	}
}
