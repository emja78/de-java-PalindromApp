package de.jank.impl;

/**
 * @author emanuel.jank
 */
public class PalindromCheck {

	/**
	 * Checks if a word is palindromic. The implementation is case insensitive.
	 * 
	 * Palindromic phrases are not supported, while spaces are handled like characters.
	 * 
	 * @param word 
	 * @return true, if given word is palindromic
	 */
	public boolean isPalindromicWord(String word) {
		
		// convert to char[] with lower cases
		char[] letters = word.toLowerCase().toCharArray();

		// set indices to first and last letter 
		int i = 0;
		int j = letters.length - 1;
		
		while (i<j) {
			// compare letters
			if (letters[i] != letters[j])
				return false; // not palindromic
			
			// update indices
			i++;
			j--;
		}
		
		// word is palindromic
		return true;
	}
}
