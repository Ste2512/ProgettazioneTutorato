import static org.junit.Assert.*;

import org.junit.Test;


public class CounterTest {


	@Test
	public void testInc() {
		Counter c = new Counter();
//		assertEquals(1, c.inc()); //PASS
		assertEquals("FALLISCE", 1, c.inc()); //FAIL
		//assertTrue(2==c.inc());
		//assertFalse(2!=c.inc());
		//assertNull(c.inc());
	}

	@Test
	public void testDec() {
		Counter c = new Counter();
		assertEquals(0, c.dec());
	}

}
