package kb.junit.tutorialspoint;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Testrunner durchläuft eine Reihe von angelegten Tests.
 * Dabei wird in einer Result Variable die Testergebnisse der jeweils angegebenen
 * Klasse gespeichert. Mithilfe einer Schleife können mögliche Fehler
 * ausgegeben werden.
 * 
 * Falls alle Tests innerhalb der Klasser erfolgreich waren, so wird in der
 * Konsole true angezeigt, ansonsten false.
 */
public class TestRunner {
	public static void main(String[] args) {
		
		//Das Ergebnis soll die Tests aus der Klasse TestMessageUtil enthalten
		Result result = JUnitCore.runClasses(TestMessageUtil.class);
		
		//Fehler werden aus dem Ergebnis Container (result) iteriert
		for(Failure failure : result.getFailures()){
			
			/*
			 * Jeder Fehler wird in einen Fehlermeldungsstring umgewandelt und
			 * in der Konsole ausgegeben.
			 */
			System.out.println(failure.toString());
		}
		
		/*
		 * wasSuccessful() gibt einen boolean Wert zurück.
		 * Nützlich für Kommandozeile
		 */
		System.out.println(result.wasSuccessful());
	}
}
