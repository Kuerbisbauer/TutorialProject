package kb.junit.tutorialspoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMessageUtil {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil("Hello World");
	
	@Test
	public void testPrintMessage() {
		/*
		 * �berpr�ft ob message mit dem R�ckgabewert der Methode printMessage() 
		 * in der Klasse messageUtil �bereinstimmt.
		 */
		assertEquals(message,messageUtil.printMessage());
	}
}
