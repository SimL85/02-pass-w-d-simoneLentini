package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {
	Conversor conversor = new Conversor();
	@Test
	public void testConversorName() {
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
		assertEquals(conversor.getNameConverterArray().get(1), "Your last name is smaller than your first name");
		assertEquals(conversor.getNameConverterArray().get(2), "The lengths of your first name is your last name are the same");
	}
	@Test
	public void testConversorGender() {
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(0), "man!");
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!");
		assertEquals(conversor.getGenderConverterArray().get(2), "person!");
	}
}
