package com.eclipse.practicas.junitbasico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void test() {
		Rectangulo rectangulo1 = new Rectangulo(2, 3);
		assertEquals(10, rectangulo1.perimetro());
		assertEquals(6, rectangulo1.area());
		Rectangulo rectangulo2 = new Rectangulo(3, 4);
		assertEquals(14, rectangulo2.perimetro());
		assertEquals(12, rectangulo2.area());
	}
	
	@Test 
	void testLongitudDiagonal() {
		Rectangulo rectangulo1 = new Rectangulo(2, 3);
		assertEquals(3.6055, rectangulo1.longitudDiagonal(), 0.0001);
		Rectangulo rectangulo2 = new Rectangulo(3, 4);
		assertEquals(5, rectangulo2.longitudDiagonal(), 0.0001);
	}
}
