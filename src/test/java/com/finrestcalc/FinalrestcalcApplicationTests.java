package com.finrestcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.finrestcalc.operations.OperationsDeCalc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinalrestcalcApplicationTests {

	OperationsDeCalc operationCalc = new OperationsDeCalc();
	
	@Test
	public void suma() {
		
		double actual = operationCalc.suma(6.0, 5.0);
		double expected = 11.0;
		
		String actualStr = String.valueOf(actual);
		String expectedStr = String.valueOf(expected);
		
		assertEquals(expectedStr, actualStr);

	}
	
	@Test
	public void resta() {
		
		double actual = operationCalc.resta(33, 20);
		double expected = 13;
		
		String actualStr = String.valueOf(actual);
		String expectedStr = String.valueOf(expected);
		
		assertEquals(expectedStr, actualStr);

		
	}
	
	@Test
	public void multi() {
		
		double actual = operationCalc.multi(10.0, 4.0);
		double expected = 40.0;
		
		String actualStr = String.valueOf(actual);
		String expectedStr = String.valueOf(expected);
		
		assertEquals(expectedStr, actualStr);

		
	}
	
	@Test
	public void divi() {
		
		double actual = operationCalc.divi(7.0, 4.0);
		double expected = 1.75;
		
		String actualStr = String.valueOf(actual);
		String expectedStr = String.valueOf(expected);
		
		assertEquals(expectedStr, actualStr);

		
	}

}
