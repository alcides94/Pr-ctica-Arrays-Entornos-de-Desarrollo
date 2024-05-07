package util;


import java.util.*;
public class MisArrays {
	
	/**
	 * Devuelve la media de las notas
	 * 
	 * @param numeros	recibe como parametro un array con las notas
	 * @return			retorna el valor de la media
	 * @throws IllegalArgumentException devuelve una excepcion si el parametro enviado es menor a 0 o mayor a 10
	 * 
	 */
	
	public float mediaNotas(int [] numeros) {
		int suma=0;
		float media=0;
		
		
			for (int i=0; i<numeros.length;i++) {
				if (numeros[i]>10&&numeros[i]<0) {
					throw new IllegalArgumentException ("Las notas deben estar entre 0 y 10");
					
				}
				suma=suma+numeros[i];		
			}
		
		media=suma/numeros.length;
		
		return media;
		
	}
	
	/**
	 *  devuelve en un float la mediana con decimales de dicho array.
	 * 
	 * @param numeros	recibe como para emtro un array
	 * @return			devuelve la mediana del parametro recibido
	 * @throws IllegalArgumentException devuelve una excepcion si el parametro enviado es menor a 0 o mayor a 10
	 * 
	 */
	
	public float medianaNotas(int [] numeros) {
		float mediana=0;
		
		for (int i=0; i<numeros.length;i++) {
			
			if (numeros[i]>10&&numeros[i]<0) {
				throw new IllegalArgumentException ("Las notas deben estar entre 0 y 10");
				
			}
			
			
		} 
		
		Arrays.sort(numeros);
		int cantidad=numeros.length;
		
		if (numeros.length%2==0) {
			
			mediana =(numeros[cantidad/2-1]+numeros[cantidad/2])/2.0f;
			
		}else {
			
			mediana=numeros[cantidad/2];
		}
		
		
		
		return mediana;
	}
	
	
	
	
}
