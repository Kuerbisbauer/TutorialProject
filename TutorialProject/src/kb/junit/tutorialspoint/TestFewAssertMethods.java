package kb.junit.tutorialspoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFewAssertMethods {

	@Test
	public void testIt() {

		//Versuchskaninchen
		int num = 5;
		String str = "JUnit is working fine";
		
		//Sind die Beiden Objekte gleich?
		assertEquals("JUnit is working fine", str);
		
		//Ist num NICHT größer 6?
		assertFalse(num > 6);
		
		//Ist der String NICHT null?
		assertNotNull(str);
		
		//TODO http://www.tutorialspoint.com/junit/junit_api.htm TestCase Class
	}
}
