package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project;

import java.util.Scanner;

// 1st line of input is the number n
// 2nd line of input is the exponent p
// Output will be n^p

// Here assuming exponent p is non-negative
public class Question4PowerXoverN{
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.print("Enter the power (exponent): ");
		int exponent = sc.nextInt();

		long answer = powerOfNumber(number, exponent);
		System.out.printf("%d^%d = %d", number, exponent, answer);
	}

	// After every iteration the exponent will be shifted right by 1
	// and number will multiply itself i.e. square itself

	// So the final output will be n^p as expected
	private static long powerOfNumber(int number, int exponent) {
		long answer = 1;

		while (exponent > 0) {
			if ((exponent & 1) == 1) {
				answer *= number;
			}
			number *= number;
			exponent >>= 1;
		}

		return answer;
	}
}
