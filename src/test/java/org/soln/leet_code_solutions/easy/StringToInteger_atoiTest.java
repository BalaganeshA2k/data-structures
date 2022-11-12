package org.soln.leet_code_solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringToInteger_atoiTest {
	StringToInteger_atoi underTest = new StringToInteger_atoi();
	@Test
	void stringOfSignedIntegerWithLeadingWhiteSpacesShouldReturnOnlySignedInteger() {
		int actualSolution1 =underTest.solution1("    -41");
		int expected=-41;
		assertEquals(expected, actualSolution1);
	}
	
	@Test
	void stringOfIntegerWithAWordShoulOnlyReturnInteger() {
		int actualSolution1=underTest.solution1("9898 and a word");
		int actualSolution2=underTest.solution1("words and 9898");
		int expected = 9898;
		assertEquals(expected, actualSolution1);
		assertEquals(expected, actualSolution2);
	}
	@Test
	void stringOfIntegerWithLeadingZerosShouldOnlyReturnInteger() {
		int actualSolution1= underTest.solution1("0000499");
		int expected =499;
		assertEquals(expected, actualSolution1);
		}
}
