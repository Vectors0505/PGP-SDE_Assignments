package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project;

import java.util.Scanner;

// 1st line of input determines number of elements in an array
// 2nd line to take input values for each element

// Output will be the largest number possible without changing the order of the digits in the number
public class Question5LargestNumberPossible{
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.print("Enter the elements: ");
		for (int i = 0 ; i < n ; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print("Largest number possible = ");
		System.out.println(findLargestNumber(array));
	}

	public static String findLargestNumber(int[] array) {
		boolean allZeros = true;

		// Checking for an edge case if all elements in an array are 0
		// In such case, output will be 0 as largest number formed will be 0
		for (int j : array) {
			if (j != 0) {
				allZeros = false;
				break;
			}
		}

		if (allZeros) {
			return "0";
		}

		// Converting integer array to string to compare values
		String[] stringArray = new String[array.length];
		for (int i = 0 ; i < array.length ; i++) {
			stringArray[i] = String.valueOf(array[i]);
		}

		sort(stringArray);

		StringBuilder answer = new StringBuilder();
		for (int i = 0 ; i < array.length ; i++) {
			answer.append(stringArray[i]);
		}

		return answer.toString();
	}

	// Sort function sorts the array in such a way that when all elements are appended in ascending order
	// we will get the largest number possible from that array
	private static void sort(String[] stringArray) {

		for (int j = stringArray.length - 1 ; j > 0 ; j--) {
			for (int i = 1 ; i <= j ; i++) {
				String str1 = stringArray[i] + stringArray[i - 1];
				String str2 = stringArray[i - 1] + stringArray[i];
				if (str1.compareTo(str2) > 0) {
					String temp = stringArray[i];
					stringArray[i] = stringArray[i - 1];
					stringArray[i - 1] = temp;
				}
			}
		}
	}
}
