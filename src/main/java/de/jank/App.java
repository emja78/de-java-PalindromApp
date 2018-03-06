package de.jank;

import de.jank.impl.PalindromCheck;

public class App {
	private static final PalindromCheck check = new PalindromCheck();

	public static void main(String[] args) {

		// print usage, if necessary
		if (args == null || args.length == 0) {
			System.out.println("This tool checks, if given words are palindromic.");
			System.out.println("Usage: java -jar Palindromchecker-0.0.1-SNAPSHOT.jar <testWord1> <testWord2> ...");
		}

		try {
			// run palindrom check for each input params
			for (String s : args)
				if (check.isPalindromicWord(s))
					System.out.println(s + " is palindromic.");
				else
					System.out.println(s + " is NOT palindromic.");

		} catch (Exception e) {
			// just for completeness
			System.out.println("An unexpected error has occurs.");
			e.printStackTrace();
		}

	}
}
