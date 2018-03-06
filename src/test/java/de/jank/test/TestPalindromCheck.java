package de.jank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.jank.impl.PalindromCheck;

public class TestPalindromCheck {

	@Test
	public void testValidPalindroms() {
		String[] testWords = { "anna", "otto", "ehe", "Retsinakanister", "ฉันกิกนัฉ" };

		PalindromCheck check = new PalindromCheck();

		for (String word : testWords)
			assertTrue("check of " + word + " failed.", check.isPalindromicWord(word));
	}

	@Test
	public void testInValidPalindroms() {
		String[] testWords = { "!!>", " anna", ">!<", "ฉันกิกนั" };

		PalindromCheck check = new PalindromCheck();

		for (String word : testWords)
			assertFalse("check of " + word + " failed.", check.isPalindromicWord(word));
	}

}
