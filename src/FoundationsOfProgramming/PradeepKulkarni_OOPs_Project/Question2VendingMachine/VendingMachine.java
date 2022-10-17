package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project.Question2VendingMachine;

import java.util.ArrayList;
import java.util.Scanner;

// Vending machine class for functionalities related to vending machine
public class VendingMachine{
	private static final Scanner sc = new Scanner(System.in);
	private final Cart cart;
	private final ArrayList<VendingMachineProduct> items;

	VendingMachine() {
		this.cart = new Cart();
		this.items = new ArrayList<>();
		initializeProducts();
	}

	public void getPayment() {
		if (this.cart.getCount() == 0) {
			System.out.println("Add items to the cart first");
			return;
		}
		double price = this.cart.getTotalPrice();
		int choice;
		do {
			System.out.println("Choose payment mode: ");
			System.out.printf("1. Cash Payment: %.2f%n", price);
			System.out.printf("2. Card Payment: %.2f%n", price * 2);
			choice = sc.nextInt();

			PaymentMethod paymentMethod = null;

			switch (choice) {
				case 1:
					paymentMethod = new CashPayment();
					break;
				case 2:
					paymentMethod = new CardPayment();
					break;
			}

			if (choice < 1 || choice > 2) {
				System.out.println("Enter valid choice");
			} else {
				for (int i = 0 ; i < this.cart.getCount() ; i++) {
					String productName = this.cart.getName(i);
					for (int j = 0 ; j < this.items.size() ; j++) {
						if (productName.equals(this.items.get(j).getName())) {
							this.items.remove(j);
							break;
						}
					}
				}
				paymentMethod.makePayment(this.cart);
			}
		} while (choice < 1 || choice > 2);
	}

	private void initializeProducts() {
		for (int i = 0 ; i < 25 ; i++) {
			if (i < 5) {
				this.items.add(new Chips());
			} else if (i < 10) {
				this.items.add(new ChocolateBar());
			} else if (i < 15) {
				this.items.add(new WaterBottle());
			} else if (i < 20) {
				this.items.add(new ProteinBar());
			} else {
				this.items.add(new EnergyDrink());
			}
		}
	}

	public void displayProducts() {
		if (this.items.size() == 0) {
			System.out.println("All products sold, new products will be added soon.");
			return;
		}
		System.out.println("No. | Item Name | Price");
		int i = 1;
		for (VendingMachineProduct item : this.items) {
			System.out.println((i++) + " | " + item.getName() + " | " + item.getPrice());
		}
	}

	public void displayItemsInCart() {
		this.cart.displayItemsInCart();
	}

	public void addItemToCart(String productName) {
		boolean isPresent = false;
		for (VendingMachineProduct product : this.items) {
			if (product.getName().equals(productName)) {
				isPresent = true;
				break;
			}
		}

		if (isPresent) {
			switch (productName) {
				case "Chips":
					this.cart.addItemToCart(new Chips());
					break;
				case "Water Bottle":
					this.cart.addItemToCart(new WaterBottle());
					break;
				case "Protein Bar":
					this.cart.addItemToCart(new ProteinBar());
					break;
				case "Energy Drink":
					this.cart.addItemToCart(new EnergyDrink());
					break;
				case "Chocolate Bar":
					this.cart.addItemToCart(new ChocolateBar());
					break;
			}
		} else {
			System.out.printf("0 %s in the vending machine", productName);
		}
	}

	public void removeItemFromCart(String productName) {
		this.cart.removeItemFromCart(productName);
	}
}
