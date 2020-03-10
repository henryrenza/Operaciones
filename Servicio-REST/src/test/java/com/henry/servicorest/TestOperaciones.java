package com.henry.servicorest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOperaciones {

	double num1=4; double num2=2;
	Operaciones operacion = new Operaciones(num1, num2);
	
	@Test
	void testSuma() {
		double resultado = operacion.Suma(num1, num2);
		assertEquals(6, resultado);
	}
	
	@Test
	void testResta() {
		double resultado = operacion.Resta(num1, num2);
		assertEquals(2, resultado);
	}
	
	@Test
	void testMulti () {
		double resultado = operacion.Multi(num1, num2);
		assertEquals(8, resultado);
	}
	
	@Test
	void testDivision() {
		double resultado = operacion.Division(num1, num2);
		assertEquals(2, resultado);
	}

}
