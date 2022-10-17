package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project;

import java.util.Scanner;

// Give input directly as a string
public class Question1Palindrome{
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Take input as a string
		// Assuming it can be a line ending with \n character
		String str = sc.nextLine();
		System.out.println(checkPalindrome(str));
	}

	private static boolean checkPalindrome(String str) {
		// Check if length = 0 or 1, if yes, then return true
		// Assuming string with length 0 is palindrome
		if (str.length() == 1 || str.length() == 0) {
			return true;
		} else {
			// If length is more than 1 check from 1st and character using helper function
			return helperCheckPalindrome(str, 0, str.length() - 1);
		}
	}

	// Helper function is used to check if a string is palindrome using 2 pointer method
	// After every recursion call left pointer will increment and right will decrement
	// Then it will check for the next set of characters
	private static boolean helperCheckPalindrome(String str, int leftPointer, int rightPointer) {
		if (leftPointer >= rightPointer) {
			return true;
		}

		if (str.charAt(leftPointer) == str.charAt(rightPointer)) {
			return helperCheckPalindrome(str, leftPointer + 1, rightPointer - 1);
		} else {
			return false;
		}
	}
}