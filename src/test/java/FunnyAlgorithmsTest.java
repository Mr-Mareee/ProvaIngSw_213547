import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Principale.FunnyAlgorithms;

public class FunnyAlgorithmsTest {
	public static FunnyAlgorithms prova;
	public static DateTime tempo;
	@SuppressWarnings("deprecation")
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	@BeforeClass
	public static void Inizio() {
		prova=new FunnyAlgorithms();
		System.out.println("STO INIZIANDO A FARE I TEST");
		tempo = new DateTime();
		System.out.println(tempo);
	}
	
	@AfterClass
	public static void Fine() {
		System.out.println("STO FINENDO COL FARE I TEST");
		System.out.println("Fine Test "+new Period(tempo, new DateTime()));
	}
	@Test
	public void ProvaStringToInt() {
		thrown.expect(IllegalArgumentException.class);
		prova.stringToIntConverter("Abc");
	}
	@Test
	public void ProvaStringToIntBuono() {
		assertEquals(123, prova.stringToIntConverter("123"));
	}
}
