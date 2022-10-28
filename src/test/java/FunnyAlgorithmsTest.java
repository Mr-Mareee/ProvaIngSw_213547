import org.joda.time.DateTime;
import org.joda.time.Period;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Principale.FunnyAlgorithms;

public class FunnyAlgorithmsTest {
	public FunnyAlgorithms prova;
	public static DateTime tempo;
	@BeforeClass
	public static void Inizio() {
		System.out.println("STO INIZIANDO A FARE I TEST");
		tempo = new DateTime();
		System.out.println(tempo);
	}
	
	@AfterClass
	public static void Fine() {
		System.out.println("STO FINENDO COL FARE I TEST");
		System.out.println(new Period(tempo, new DateTime()));
	}
	@Test
	public void prova1() {
		
	}
}
