package com.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.Greeting;

@DisplayName(value="First JUnit Test Case")
class TestGreeting {

	private Greeting greeting = new Greeting();
	
	@Test
	@Disabled(value="Not used")
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName(value="Test Message is not null")
	void testGetMessageNotNull() {
		
		String actual = greeting.getMessage();
		
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName(value="Test for getMessage to return Hello World")
	void testGetMessageReturnsString() {
		
		String actual = greeting.getMessage();
		
		assertEquals("Welcome to Java Training", actual);
	}
	
	@Test
	@DisplayName(value="Test for getMessage using assertAll")
	void testMoreThanOneCase() {
		
		assertAll( 
				() -> assertNotNull(greeting.getMessage()), 
				() -> assertEquals(24, greeting.getMessage().length()),
				() -> assertEquals("Welcome to Java Training", greeting.getMessage())
				);
	}

}
