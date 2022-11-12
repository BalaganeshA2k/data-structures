package org.soln.leet_code_solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringToInteger_atoiTest {
	StringToInteger_atoi underTest = new StringToInteger_atoi();
	@Test
	void stringOfIntegerShouldReturnTheInteger() {
		int actualSolution = underTest.solution1("+41");
		int excepted = 41;
		assertEquals(excepted, actualSolution);
	}
	@Test
	void emptyStringShouldReturnZero() {
		assertEquals(0, underTest.solution1(""));
	}
	@Test
	void stringWithBothPlusAndMinusSymbolShouldReturnZero() {
		int actualSolution= underTest.solution1("+-");
		int excepted= 0;
		assertEquals(excepted, actualSolution);
	}
	@Test
	void stringWithPlusOrMinusOtherThanFirstIndexAfterTrimmingShouldReturnZero() {
		int actual =underTest.solution1("09090-87sflk");
		int expected=9090;
		assertEquals(expected,actual);
	}
	@Test
	
	void stringOfSignedIntegerWithLeadingWhiteSpacesShouldReturnOnlySignedInteger() {
		int actualSolution1 =underTest.solution1("     -78");
		int expected=-78;
		assertEquals(expected, actualSolution1);
	}
	
	@Test
	void stringOfIntegerWithAWordShoulOnlyReturnInteger() {
		int actualSolution1=underTest.solution1("9898 and a word");
		int expected = 9898;
		assertEquals(expected, actualSolution1);
	}
	@Test
	void stringOfIntegerStartingWithAWordShouldReturnOnlyZero() {
		int actualSolution2=underTest.solution1("words and 9898");
		int expected = 0;
		assertEquals(expected, actualSolution2);
	}
	
	@Test
	void stringOfIntegerWithLeadingZerosShouldOnlyReturnInteger() {
		int actualSolution1= underTest.solution1("0000499");
		int expected =499;
		assertEquals(expected, actualSolution1);
		}
	@Test
	void stringOfValueOutOfRangeOfIntegerShouldBeClampedToInteger() {
		String valueOutOfInteger= String.valueOf("-91283472332");
		assertEquals(Integer.MIN_VALUE,underTest.solution1(valueOutOfInteger));
	}
}
