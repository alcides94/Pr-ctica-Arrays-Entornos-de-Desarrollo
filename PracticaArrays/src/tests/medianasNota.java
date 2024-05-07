package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class medianasNota {


	static int [] numeros1;
	static int [] numeros2;
	static int [] numeros3;
	
	@BeforeAll 
	static void setup() {
		numeros1= new int[] {1,2,3,4,5};		
		numeros2= new int[] {-1,2,3,4,5};
		numeros3= new int[] {1,2,3,4,5,9};
	}	
	
		
	@Test
	void testValido() {
		float medianaEsperada=3;
		float medianaObtenida=MisArrays.medianaNotas(numeros1);
		assertEquals(medianaEsperada, medianaObtenida);
	}
	
	@Test
	void testValidoPar() {
		float medianaEsperada=3.5f;
		float medianaObtenida=MisArrays.medianaNotas(numeros3);
		assertEquals(medianaEsperada, medianaObtenida);
	}
	
	@Test
	void testException2() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()->MisArrays.medianaNotas(numeros2));

		String esperado ="Las notas deben estar entre 0 y 10";
		String obtenido =excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}

}
