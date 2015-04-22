package simple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import testing.Multiplication;

public class PowerTest {

	@Test
	public void test() {
		Multiplication mult = new Multiplication();
		int a = 3;
		int b = 12;
		assertEquals(mult.multiply(a, b), a*b);
	}
	
	@Test
	public void testWithMockito(){
		int a = 4;
		int b = 17;
		Multiplication mult = Mockito.mock(Multiplication.class);
		Mockito.when(mult.multiply(a, b)).thenReturn(a*b);
	}

}
