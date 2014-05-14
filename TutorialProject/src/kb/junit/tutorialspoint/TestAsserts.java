package kb.junit.tutorialspoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAsserts {

	@Test
	public void testAssertions(){
		//Testdaten
		String a = "abc";
		String b = "def";
		String c = null;
		String d = "abc";
		String e = new String("abc");
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray 	= {"one", "two", "three"};
		String[] resultArray 	= {"one", "two", "three"};
		
		//Vergleicht ob die Beiden Objekte gleich sind
		assertEquals(a, e);
		
		//Überprüft ob dieser Austruck wahr ist
		assertTrue(val1 < val2);
		
		//Überprüft ob der Ausdruck falsch ist
		assertFalse(val1 > val2);
		
		//Ist das Object NICHT null?
		assertNotNull(a);
		
		//Ist das Object null?
		assertNull(c);
		
		//Überprüft ob die Referenz zum gleichen Objekt zeigt
		assertSame(d, a);
		
		//Überprüft ob die Referenz NICHT zum gleichen Objekt zeigt
		assertNotSame(d, e);
		
		//Überprüft ob die Arrays gleich sind
		assertArrayEquals(expectedArray, resultArray);
	}
}
