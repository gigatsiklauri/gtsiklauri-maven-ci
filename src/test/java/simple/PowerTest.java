package simple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import testing.multiply;

public class PowerTest {

	@Test
	public void test() {
		multiply mult = new multiply();
		int a = 3;
		int b = 12;
		assertEquals(mult.mult(a, b), a*b);
	}

}
