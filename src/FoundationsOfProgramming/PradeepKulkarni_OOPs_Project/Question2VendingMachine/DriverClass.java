package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project.Question2VendingMachine;

import java.util.Scanner;

// Driver class for implementation of vending machine
public class DriverClass{
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome");
		VendingMachine vendingMachine = new VendingMachine();
		int choice;
		do {
			System.out.println("""

					1. Display Products
					2. Add item to cart
					3. Remove item from cart
					4. Display items in cart
					5. Make Payment
					0. Exit""");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					vendingMachine.displayProducts();
					break;
				case 2:
					addItemToCart(vendingMachine);
					break;
				case 3:
					removeItemFromCart(vendingMachine);
					break;
				case 4:
					vendingMachine.displayItemsInCart();
					break;
				case 5:
					vendingMachine.getPayment();
					break;
				case 0:
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		} while (choice != 0);
	}

	private static void removeItemFromCart(VendingMachine vendingMachine) {
		int choice;
		do {
			System.out.println("""

					1. Chips
					2. Water Bottle
					3. Chocolate Bar
					4. Energy Drink
					5. Protein Bar
					0. Exit""");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					vendingMachine.removeItemFromCart("Chips");
					break;
				case 2:
					vendingMachine.removeItemFromCart("Water Bottle");
					break;
				case 3:
					vendingMachine.removeItemFromCart("Chocolate Bar");
					break;
				case 4:
					vendingMachine.removeItemFromCart("Energy Drink");
					break;
				case 5:
					vendingMachine.removeItemFromCart("Protein Bar");
					break;
				case 0:
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		} while (choice != 0);
	}

	private static void addItemToCart(VendingMachine vendingMachine) {
		int choice;
		do {
			System.out.println("""

					1. Chips
					2. Water Bottle
					3. Chocolate Bar
					4. Energy Drink
					5. Protein Bar
					0. Exit""");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					vendingMachine.addItemToCart("Chips");
					break;
				case 2:
					vendingMachine.addItemToCart("Water Bottle");
					break;
				case 3:
					vendingMachine.addItemToCart("Chocolate Bar");
					break;
				case 4:
					vendingMachine.addItemToCart("Energy Drink");
					break;
				case 5:
					vendingMachine.addItemToCart("Protein Bar");
					break;
				case 0:
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		} while (choice != 0);
	}
}
