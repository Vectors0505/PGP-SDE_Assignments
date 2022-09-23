package Prework.Prework_Assignment_PradeepKulkarni;

import java.util.Scanner;

class PatternPrinter{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		patternPrinter(n);
	}

	static void patternPrinter(int n) {
		// for loop for the number of rows in decrementing order (no of rows = n)
		for (int i = n ; i > 0 ; i--) {

			// nested for loop for the number of elements to be printed in one row in
			// decrementing order (number of columns per row = n * i)
			for (int j = n ; j > 0 ; j--) {

				// for loop for printing each element multiple times
				// each element should be printed i times (rows decrementing)
				for (int k = 0 ; k < i ; k++) {
					System.out.print(j + " ");
				}
			}

			// adding new line after each successful row printing
			System.out.println();
		}
	}
}