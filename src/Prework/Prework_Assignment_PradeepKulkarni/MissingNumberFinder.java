package Prework.Prework_Assignment_PradeepKulkarni;

import java.util.Scanner;

class MissingNumberFinder{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int[] arr = new int[size - 1];

		for (int i = 0 ; i < size - 1 ; i++)
			arr[i] = in.nextInt();

		System.out.println(missingNumberFinder(arr, size));

	}

	static int missingNumberFinder(int[] array, int n) {
		// for loop for iterating through numbers 1 to n - 1
		for (int i = 1 ; i < n ; i++) {

			// boolean to check if the number is present in the array
			boolean presentInArray = false;

			// for loop for iterating through array
			for (int k : array) {

				// condition to check if number i is present in the array
				// if number i is present in the array boolean presentInArray will become true
				if (k == i) {
					presentInArray = true;
					break;
				}
			}

			// if the boolean presentInArray is still false that means element i is missing
			if (!presentInArray)
				return i;
		}

		// if each number till [n - 1] is present in the array that means the number n
		// is missing in that array, so we return n
		return n;

		// if the array is sorted in all cases, question can be solved in O(n) time complexity
	}
}