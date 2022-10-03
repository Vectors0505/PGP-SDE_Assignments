package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

import java.util.Scanner;

public class DriverClass{

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int temp;

		do {
			System.out.println("Select your choice");
			System.out.println("1. Take a new order");
			System.out.println("2. Exit");
			temp = sc.nextInt();
			if (temp == 1) {
				Customer customer = new Customer();
				customer.newOrder();
			} else if (temp != 2) {
				System.out.println("Please enter a valid choice");
			}
		} while (temp != 2);
	}

}
