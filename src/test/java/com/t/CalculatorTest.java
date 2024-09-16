package com.t;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.abbas.Calculator;


public class CalculatorTest {

	@Test
	public void addTest() {
		
		
		assertEquals(10, Calculator.add(3, 7));
	}

	@Test
	public void mulTest() {

		assertEquals(49, Calculator.mul(7, 7));
	
	}

}
