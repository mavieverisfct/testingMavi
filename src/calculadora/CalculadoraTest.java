package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int resul = calc.add(2,  3);
		int esper = 5; // 2 + 3 = 5
		assertEquals(esper, resul);
	}
	@Test
	public void testAnsSum() {
		int resul = calc.sub(3,  2);
		int esper = 1; //3 - 2 =1
		assertEquals(esper, resul);
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.clear();
	}
	
	
}
// esto es un AÑADIDO PARA GIT AL FINAL

//cambia en PRUEBA
