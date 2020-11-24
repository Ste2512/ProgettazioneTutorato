import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class CoinBoxTest {

	static private CoinBox C1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		C1=new CoinBox();
	}

	@Test
	public void testInit() {
		assertEquals(0,C1.display());
	}
	
	@Test
	public void testSingleVend() {
		C1.addQtr();
		C1.addQtr();
		assertTrue(C1.vend());
	}
	
	@Test
	public void testNotEnough() {
		C1.addQtr();
		assertFalse(C1.vend());
	}
}
