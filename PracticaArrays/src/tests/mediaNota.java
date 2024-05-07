package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import util.MisArrays;


class mediaNota {
	
	static int [] numeros1;
	static int [] numeros2;
	static int [] numeros3;
	
	@BeforeAll 
	static void setup() {
		numeros1= new int[] {1,2,3,4,5};		
		numeros2= new int[] {-1,2,3,4,5};
		numeros3= new int[] {1,2,3,4,5,11};
	}	
	
		
	@Test
	void testValido() {
		float mediaEsperada=3;
		float mediaObtenida=MisArrays.mediaNotas(numeros1);
		assertEquals(mediaEsperada, mediaObtenida);
	}
	
	@Test
	void testException() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()->MisArrays.mediaNotas(numeros2));

		String esperado ="Las notas deben estar entre 0 y 10";
		String obtenido =excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testException2() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()->MisArrays.mediaNotas(numeros3));

		String esperado ="Las notas deben estar entre 0 y 10";
		String obtenido =excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}

}
