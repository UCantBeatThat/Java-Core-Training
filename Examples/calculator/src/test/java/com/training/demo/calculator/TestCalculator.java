package com.training.demo.calculator;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.training.demo.calculator.Calculator;

class TestCalculator {

	private Calculator calculator = new Calculator();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BEFORE ALL CALLED ONLY ONCE BEFORE ALL TESTS");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AFTER ALL CALLED ONLY ONCE AFTER ALL TESTS");
	}

	@BeforeEach
	void setUp(TestInfo info) throws Exception {
		System.out.println(info.getDisplayName() + " Called");
	}

	@AfterEach
	void tearDown(TestInfo info) throws Exception {
		System.out.println(info.getDisplayName() + " Finished");
	}

	@Test
	@DisplayName(value="Check the return value of the method")
	void testCalculateReturnsValue() {
		
		double actual = calculator.calculate("45", "55", "65");
		
		double expected = 550.0;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	@DisplayName(value="Check if method throws Exception")
	void testCalculateThrowsException() {
		
		assertAll(
				() -> assertThrows(ArrayIndexOutOfBoundsException.class, 
						() -> calculator.calculate("45")),
				() -> assertThrows(NumberFormatException.class, 
						() -> calculator.calculate("20", "fourtyFive")) 
				);
		
	}
	
	@Test
	@DisplayName(value="Check if method times out")
	void testCalculateForTimeout() {
		
		assertTimeout(ofMillis(1000), () -> calculator.calculate("45", "50"));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5})
	@DisplayName(value="Check if method does not return null at odd positions of a list")
	void testCalculatorGetNameFromList(int indexPos) {
		
		LocalDate date = LocalDate.now();
		
		Assumptions.assumeTrue(date.getDayOfWeek().getValue() == 2);
		assertNotNull(calculator.getNameFromList(indexPos));
	}

}
