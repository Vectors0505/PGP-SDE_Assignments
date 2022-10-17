package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project;

import java.util.Arrays;
import java.util.Scanner;

// 1st line of input determines number of elements in an array
// 2nd line to take input values for each element
// 3rd line of input is the target value
// function will print [-1, -1] if no such target is found
public class Question3SumOfTwoElements{
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of elements in an array: ");
		int n = sc.nextInt();

		System.out.print("Enter elements of the array: ");
		int[] array = new int[n];
		for (int i = 0 ; i < n ; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print("Enter target number: ");
		int target = sc.nextInt();

		int[] answer = sumOfTwoElements(array, target);
		System.out.println("Output array: " + Arrays.toString(answer));
	}

	private static int[] sumOfTwoElements(int[] array, int target) {
		int[] answer = new int[2];
		answer[0] = -1;
		answer[1] = -1;

		int leftPointer = 0;
		int rightPointer = array.length - 1;

		// If the value at left pointer and right pointer equals target, it'll return array consisting
		// of those two elements

		// If target is smaller it means left pointer should be incremented to check for larger value as
		// array is sorted and vice versa for right pointer
		while (leftPointer < rightPointer) {
			if (array[leftPointer] + array[rightPointer] == target) {
				answer[0] = leftPointer;
				answer[1] = rightPointer;
				return answer;
			} else if (array[leftPointer] + array[rightPointer] < target) {
				leftPointer++;
			} else if (array[leftPointer] + array[rightPointer] > target) {
				rightPointer--;
			}
		}

		return answer;
	}
}