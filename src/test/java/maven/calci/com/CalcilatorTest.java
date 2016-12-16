package maven.calci.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcilatorTest {
	@Test
	public void addTest(){
		Calcilator c = new Calcilator();
		assertEquals(2, c.add(1, 1));
	}
	
	@Test
	public void subtractTest(){
		Calcilator c = new Calcilator();
		assertEquals(0, c.subtract(1, 1));
	}
}