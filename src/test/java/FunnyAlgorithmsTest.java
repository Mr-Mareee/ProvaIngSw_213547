import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
	static int[] elem;
	@SuppressWarnings("deprecation")
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	@BeforeClass
	public static void Inizio() {
		prova=new FunnyAlgorithms();
		System.out.println("STO INIZIANDO A FARE I TEST");
		tempo = new DateTime();
		System.out.println(tempo);
		elem = new int[4];
		elem[0]=1;elem[1]=2;elem[2]=5;elem[3]=3;
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
	@Test
	public void ProvaNegativi() {
		assertEquals(-122, prova.stringToIntConverter("-122"));
	}
	@Test
	public void ProvaSpazio() {
		assertEquals(10,prova.stringToIntConverter("10 "));
	}
	@Test
	public void ProvaSpazioNegativo() {
		thrown.expect(IllegalArgumentException.class);
		prova.stringToIntConverter("2 3");
	}
	@Test 
	public void TooBig() {
		thrown.expect(IllegalArgumentException.class);
		prova.stringToIntConverter("32768");
	}
	@Test 
	public void TooLittle() {
		thrown.expect(IllegalArgumentException.class);
		prova.stringToIntConverter("-32769");
	}
	@Test
	public void testBinarySearchFinds() {
		assertNotEquals(-1, prova.binarySearch(elem,5));
	}
	
	@Test
	public void testBinarySearchGetsIt() {
		assertEquals(-1, prova.binarySearch(elem, 4));
	}
	/*
	@Test
	public void testAscendentSort() {
		int[] nuova=elem;
		boolean check=true;
		prova.selectionSort(nuova, 0);
		System.out.println(nuova.toString());
		for (int i=0;i<nuova.length-1;i++) {
			if (nuova[i]>nuova[i+1]) {
				check=false;
			}
		}
		assertTrue(check);
	}*/
}
