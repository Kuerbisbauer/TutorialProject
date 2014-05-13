package kb.junit.tutorialspoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMessageUtil {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil("Hello World");
	
	@Test
	public void testPrintMessage() {
		/*
		 * Überprüft ob message mit dem Rückgabewert der Methode printMessage() 
		 * in der Klasse messageUtil übereinstimmt.
		 */
		assertEquals(message,messageUtil.printMessage());
	}
}
