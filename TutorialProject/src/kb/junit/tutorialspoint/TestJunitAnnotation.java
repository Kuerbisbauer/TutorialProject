package kb.junit.tutorialspoint;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestJunitAnnotation {

	/**
	 * Wird als allererstes ausgef�hrt
	 */
	@BeforeClass
	public static void beforeClass(){
		System.out.println("in before class");
	}
	
	/**
	 * Wird zum Schluss ausgef�hrt
	 */
	@AfterClass
	public static void afterClass(){
		System.out.println("in after class");
	}
	
	/**
	 * Wird vor dem eigentlichen Test ausgef�hrt
	 */
	@Before
	public void before(){
		System.out.println("in before");
	}
	
	/**
	 * Wird nach dem Test ausgef�hrt
	 */
	@After
	public void after(){
		System.out.println("in after");
	}
	
	/**
	 * Der eigentliche Test
	 */
	@Test
	public void test(){
		System.out.println("in test");
	}
	
	/**
	 * Dieser Test wird nicht ausgef�hrt
	 */
	@Ignore
	public void ignoreTest(){
		System.out.println("in ignore test");
	}
}	
