package P1voraces;

import java.util.ArrayList;
import java.util.LinkedList;

public class Voraz {
	//suponiendo que las actividades estan ordenadas de forma ascendente por hora de finalización de la tarea
	public static boolean[] selecActividades (int[] c, int[] f) {
		 boolean[] s = new boolean[c.length];
		 s[0] = true;
		 int i = 0;
		 for (int j=1; j<c.length; j++) {
			//si la hora de finalizacion de la anterior tarea escogida es menor a la hora de inicio de la candidata
			 if ( f[i]<=c[j]) {
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
	public static boolean[] selecActFinal(int[] c,int[] f){
		 int[] aux = ordenarEnIndices(f);						//ordenamos los indice por hora de fin de actividad		 
		 boolean[] s = new boolean[f.length];	   				 //creamos el array  en el que introduciremos las soluciones
		 int i = 0;								
		 s[aux[0]] = true;
		 for (int j=1; j<c.length; j++) {
			 if ( f[aux[i]]<=c[aux[j]]) {
				 s[aux[j]] = true;
				 i = j;
			 } else {
				 s[aux[j]] = false;
			 }

	     }
		 return s;
	}
}
