package practica1;

public class Voraz {
	public static boolean[] selecActividades (int[] c, int[] f) {
		 boolean[] s = new boolean[c.length];
		 s[0] = true;
		 int i = 0;
		 for (int j=1; j<c.length; j++) {
			 if (/*esApto(s,j,c,f)*/ f[i]<c[j]/*<<actividades i, j no se solapan>>*/) {
				 s[j] = true;
				 i = j;
			 }
			 else
				 s[j] = false;
		 	}
		 return s;
		 } 
	public static boolean esApto(boolean[] s,int candidato,int[] c,int[] f){        
        for(int j=0;j<s.length;j++){
         /*tarea solución con el que se compara*/
            
            Boolean sol=s[j];
            if(sol) {
            	if((c[candidato]<f[j] && c[j]>f[candidato])||(c[candidato]>f[j] && c[j]<f[candidato]))
            	 return true;  
            }
             /*indice original de la tarea que se va a comparar*/
             /*int ind=indices[i];
        si la tarea entra en conflicto la tarea solucion devuelve no apto*/
       /* if(((c[ind]<f[sol])&&(c[sol]<f[ind]))){            
                     
        } */       
        }
        return false;
    }
	public static void ordenar(int n,int[] c,int[] f,int[] indices ) {
        int [] duracion= new int[n];
        for (int p =0;p<n;p++){
            duracion[p]=f[p]-c[p];            
        }
    boolean swapped = true;
    int j = 0;
    int tmp;
    int tmp2;
    while (swapped) {
        swapped = false;
        j++;
        for (int i = 0; i < duracion.length - j; i++) {
            if (duracion[i] > duracion[i + 1]) {
                tmp = duracion[i];
                duracion[i] = duracion[i + 1];
                duracion[i + 1] = tmp;
                tmp2=indices[i];
                indices[i]=indices[i+1];
                indices[i+1]=tmp2;
                swapped = true;               
            }
        }      
    } 
	}
}
