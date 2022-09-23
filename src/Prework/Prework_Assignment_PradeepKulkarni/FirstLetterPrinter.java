package Prework.Prework_Assignment_PradeepKulkarni;

import java.util.Scanner;

class FirstLetterPrinter{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		System.out.println(firstLetterPrinter(input));
	}

	static String firstLetterPrinter(String str) {

		// Create string object to store the answer
		StringBuilder answer = new StringBuilder();

		// boolean to check if the current character is first character of a newWord
		boolean newWord = true;

		// for loop to iterate the entire string
		for (int i = 0 ; i < str.length() ; i++) {

			// concatenate the character if it is a first letter of a new word
			if (Character.isLetter(str.charAt(i)) && newWord) {
				answer.append(str.charAt(i));
				newWord = false;
			} else if (str.charAt(i) == ' ')
				newWord = true;
		}

		// return the answer, it will return null if the string is null
		return answer.toString();
	}
}