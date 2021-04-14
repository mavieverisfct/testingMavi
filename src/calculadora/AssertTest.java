package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		String s1 = "Hola";
		String s2 = "Hola";
		assertEquals(s1, s2);
		assertSame(s1, s2);
	}

}
