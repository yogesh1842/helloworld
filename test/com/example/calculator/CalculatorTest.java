package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test_add() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.add(1, 1), "The output should be the sum of the two arguments");
	}

}
