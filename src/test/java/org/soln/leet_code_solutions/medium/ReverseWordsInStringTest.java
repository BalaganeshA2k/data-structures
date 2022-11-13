package org.soln.leet_code_solutions.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseWordsInStringTest {
	ReverseWordsInString undertest = new ReverseWordsInString();
	@Test
	void stringWithNoExtraSpacesShouldReturnStringOfReversedWords() {
		var input = "the sky is blue";
		var expected ="blue is sky the";
		var actual= undertest.solution(input);
		assertEquals(expected,actual);
	}
	@Test
	void stringWithExtraSpacesShouldReturnStringOfReverseWordsWithOneSpaceEach() {
		var input = "the  sky  is   blue";
		var expected ="blue is sky the";
		var actual =undertest.solution(input);
		assertEquals(expected,actual);
	}
	@Test 
	void stringWithExtraSpacesAndTrailingAndLeadingSpacesShouldReturnStringOfReverseWordsWithOneSpaceEach() {
		var input = "    the  sky  is    blue     ";
		var expected ="blue is sky the";
		var actual =undertest.solution(input);
		assertEquals(expected,actual);
		
	}

}
