package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

import java.util.Scanner;

public class OrderRequest{
	private static final Scanner sc = new Scanner(System.in);
	public static int customerOrderNo = 0;

	public OrderRequest() {
		displayMenu();
	}

	private void displayMenu() {
		int temp;
		do {
			System.out.println("Enter your choice of dish: ");
			System.out.println("1. Pizza");
			System.out.println("2. Pasta");
			temp = sc.nextInt();

			if (temp == 1) {
				int pizzaChoice;
				Pizza pizza = null;

				do {
					System.out.println("Enter your choice of pizza: ");
					System.out.println("1. Vegetarian");
					System.out.println("2. Non-vegetarian");
					System.out.println("3. Vegan");
					pizzaChoice = sc.nextInt();

					switch (pizzaChoice) {
						case 1:
							pizza = new VegetarianPizza();
							break;
						case 2:
							pizza = new NonVegPizza();
							break;
						case 3:
							pizza = new VeganPizza();
							break;
						default:
							System.out.println("Please enter a valid choice");
							break;
					}
				} while (pizzaChoice < 1 || pizzaChoice > 3);

				pizza.bake();
				pizza.getDescription();
			} else if (temp == 2) {
				int pastaChoice;
				Pasta pasta = null;

				do {
					System.out.println("Enter your choice of pasta: ");
					System.out.println("1. White sauce pasta");
					System.out.println("2. Red sauce pasta");
					pastaChoice = sc.nextInt();

					switch (pastaChoice) {
						case 1:
							pasta = new WhiteSaucePasta();
							break;
						case 2:
							pasta = new RedSaucePasta();
							break;
						default:
							System.out.println("Please enter a valid choice");
							break;
					}
				} while (pastaChoice < 1 || pastaChoice > 2);

				pasta.cook();
				pasta.getDescription();
			}
			if (temp < 1 || temp > 2) {
				System.out.println("Please enter a valid choice");
			}
		} while (temp < 1 || temp > 2);
		customerOrderNo++;
	}

	public void notifyCustomer() {
		System.out.printf("Your order number %d is ready %n", OrderRequest.customerOrderNo);
	}
}
