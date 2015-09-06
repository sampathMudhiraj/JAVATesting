package javaTesting;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestNgSimpleTest {
	
	@Test
	public void addTest() {
		int i = 10, j = 20;
		assertEquals(i+j, 30);
	}
}
