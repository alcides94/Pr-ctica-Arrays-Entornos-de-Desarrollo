package util;

public class Arrays {
	
	/**
	 * Devuelve la media de las notas
	 * 
	 * @param numeros	recibe como parametro un array con las notas
	 * @return			retorna el valor de la media
	 */
	
	public float mediaNotas(int [] numeros) {
		int suma=0;
		float media=0;
		
		try {
			for (int i=0; i<numeros.length;i++) {
				suma=suma+numeros[i];		
			}
		}catch (IllegalArgumentException e){
			e.printStackTrace();
		}
		
		media=suma/numeros.length;
		
		return media;
		
	}
	
}
