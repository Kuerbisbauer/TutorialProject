package kb.junit.tutorialspoint;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestTestCase extends TestCase {

	protected double fValue1;
	protected double fValue2;
	
	//Methoden mit der Annotation @Before werden vor den Tests ausgeführt
	@Before
	public void setUp(){
		System.out.println("Verbunden");
		fValue1 = 2.0;
		fValue2 = 3.0;
	}
	
	@Test
	public void testAdd(){
		//Die Anzahl der Testfälle wird gezählt
		System.out.println("Number of Test Case = " + this.countTestCases());
		
		//Der Name des Testfalles wird in den String "name" gepackt
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		
		//Der Name des Testfalles wird gesetzt
		this.setName("testNewAdd");;
		String newName = this.getName();
		System.out.println("Updated Test Case Name = " + newName);
	}
	
	public void tearDown(){
		System.out.println("Verbindung geschlossen");
	}
}
