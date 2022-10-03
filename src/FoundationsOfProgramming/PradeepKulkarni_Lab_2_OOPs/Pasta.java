package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

import java.util.Scanner;

abstract class Pasta implements CookAble{
	private static final Scanner sc = new Scanner(System.in);
	private final double price;
	private int pastaType;

	public Pasta(double price) {
		this.price = price;
		this.setPastaType();
	}

	private void setPastaType() {
		int temp;
		do {
			System.out.println("Enter your choice of pasta:");
			System.out.println("1. Penne");
			System.out.println("2. Ditalini");
			temp = sc.nextInt();

			if (temp < 1 || temp > 2) {
				System.out.println("Please enter a valid choice for pasta.");
			}
		} while (temp < 1 || temp > 2);
		this.pastaType = temp;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	private String getPastaType() {
		if (this.pastaType == 1) {
			return "Penne";
		}
		return "Ditalini";
	}

	@Override
	public void getDescription() {
		System.out.printf("Pasta type: %s %n", getPastaType());
		System.out.printf("Price: %.2f %n", getPrice());
	}

	@Override
	public void cook() {
		System.out.println("Cooking the ordered pasta.");
	}
}
