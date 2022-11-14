package org.soln.leet_code_solutions.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {
	PalindromeNumber underTest= new PalindromeNumber();
	@Test
	@DisplayName("12321 is palindrome")
	void isPalindromeTest1() {
		int input =12321;
		boolean actual =underTest.isPalindrome(input);
		assertTrue(actual);
	}
	@Test
	@DisplayName("1221 is palindrome")
	void isPalindromeTest2() {
		int input =1221;
		boolean actual =underTest.isPalindrome(input);
		assertTrue(actual);
	}
	@Test
	@DisplayName("1321 is not a palindrome")
	void isPalindromeTest3() {
		int input =1321;
		boolean actual =underTest.isPalindrome(input);
		assertFalse(actual);
	}
	@Test
	@DisplayName("13521 is not a palindrome")
	void isPalindromeTest4() {
		int input =13521;
		boolean actual =underTest.isPalindrome(input);
		assertFalse(actual);
	}

}
