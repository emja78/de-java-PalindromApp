package de.jank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.jank.impl.PalindromCheck;

public class TestPalindromCheck {

	@Test
	public void testValidPalindroms() {
		String[] testWords = { "anna", "otto", "ehe", "Retsinakanister" };

		PalindromCheck check = new PalindromCheck();

		for (String word : testWords)
			assertTrue(check.isPalindromicWord(word));
	}

	@Test
	public void testInValidPalindroms() {
		String[] testWords = { "!!>", " anna", ">!<" };

		PalindromCheck check = new PalindromCheck();

		for (String word : testWords)
			assertFalse(check.isPalindromicWord(word));
	}

}
