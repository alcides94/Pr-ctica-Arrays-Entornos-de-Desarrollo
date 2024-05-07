package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class maximaNota {

	static int [] numeros1;
	static int [] numeros2;
	static int [] numeros3;
	
	@BeforeAll 
	static void setup() {
		numeros1= new int[] {1,2,3,4,5};		
		numeros2= new int[] {-1,2,3,4,5};
		numeros3= new int[] {1,9,3,4,5,8};
	}	
	
		
	@Test
	void testValido() {
		int maximaEsperada=5;
		int maximaObtenida=MisArrays.maximaNota(numeros1);
		assertEquals(maximaEsperada, maximaObtenida);
	}
	
	@Test
	void testValidoPar() {
		int medianaEsperada=9;
		int medianaObtenida=MisArrays.maximaNota(numeros3);
		assertEquals(medianaEsperada, medianaObtenida);
	}
	
	@Test
	void testException2() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				()->MisArrays.maximaNota(numeros2));

		String esperado ="Las notas deben estar entre 0 y 10";
		String obtenido =excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}

}
