import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testCalcolatrice {

	@Test
	public void testPow() {
		Calcolatrice C=new Calcolatrice();
		assertEquals(8,C.pow(2,3));
	}
}
