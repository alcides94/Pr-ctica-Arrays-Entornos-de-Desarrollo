package util;


import java.util.*;
public class MisArrays {
	
	/**
	 * devuelve en un float la media con decimales de dicho array.
	 * 
	 * @param numeros	Recibe un array de números enteros entre 0 y 10
	 * @return			devuelve en un float la media con decimales de dicho array
	 * @throws IllegalArgumentException devuelve una excepcion si el parametro enviado es menor a 0 o mayor a 10
	 * 
	 */
	
	public static float mediaNotas(int [] numeros) {
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
	 * @param numeros	Recibe un array de números enteros entre 0 y 10
	 * @return			devuelve en un float la mediana con decimales de dicho array.
	 * @throws IllegalArgumentException devuelve una excepcion si el parametro enviado es menor a 0 o mayor a 10
	 * 
	 */
	
	public static float medianaNotas(int [] numeros) {
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
	
	/**
	 * devuelve en un entero el valor máximo de dicho array
	 * 
	 * @param numeros	Recibe un array de números enteros entre 0 y 10
	 * @return			devuelve en un entero el valor máximo de dicho array.
	 * @throws IllegalArgumentException devuelve una excepcion si el parametro enviado es menor a 0 o mayor a 10
	 * 
	 */
	
	public static int maximaNota(int [] numeros) {
		int maxima=numeros[0];
		for (int i=0; i<numeros.length;i++) {
					
			if (numeros[i]>10&&numeros[i]<0) {
				throw new IllegalArgumentException ("Las notas deben estar entre 0 y 10");	
			}	
			
			if (numeros[i]>maxima) {
				
				maxima=numeros[i];
			}
		} 
		
		return maxima;
	}
	
	/**
	 *  devuelve en un entero el valor mínimo de dicho array.
	 * 
	 * @param numeros	Recibe un array de números enteros entre 0 y 10
	 * @return			devuelve en un entero el valor mínimo de dicho array.
	 * @throws IllegalArgumentException devuelve una excepcion si el parametro enviado es menor a 0 o mayor a 10
	 * 
	 */
	public static int minimaNota(int [] numeros) {
		int minima=numeros[0];
		for (int i=0; i<numeros.length;i++) {
					
			if ((numeros[i]>10)&&(numeros[i]<0)) {
				throw new IllegalArgumentException ("Las notas deben estar entre 0 y 10");	
			}	
			
			if (numeros[i]<minima) {
				
				minima=numeros[i];
			}
		} 
		
		return minima;
		
	}
	
	
}
