package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project.Question2VendingMachine;

import java.util.ArrayList;

// Cart class for all the functionalities related to the cart
public class Cart{
	private final ArrayList<VendingMachineProduct> cart;

	Cart() {
		this.cart = new ArrayList<>();
	}

	public void addItemToCart(VendingMachineProduct product) {
		this.cart.add(product);
		System.out.printf("One %s added to the cart.%n", product.getName());
	}

	public void removeItemFromCart(String productName) {
		boolean flag = false;
		for (VendingMachineProduct vendingMachineProduct : this.cart) {
			if (vendingMachineProduct.getName().equals(productName)) {
				flag = true;
				this.cart.remove(vendingMachineProduct);
				break;
			}
		}
		if (flag) {
			System.out.printf("One %s removed from the cart.%n", productName);
		} else {
			System.out.printf("0 %s in the cart%n", productName);
		}
	}

	public int getCount() {
		return this.cart.size();
	}

	public String getName(int i) {
		return this.cart.get(i).getName();
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		for (VendingMachineProduct vendingMachineProduct : this.cart) {
			totalPrice += vendingMachineProduct.getPrice();
		}
		return totalPrice;
	}

	public void removeAll() {
		int count = this.cart.size();
		if (count > 0) {
			this.cart.subList(0, count).clear();
		}
	}

	public void displayItemsInCart() {
		System.out.println("No. Item Name");
		for (int i = 0 ; i < this.cart.size() ; i++) {
			System.out.println((i + 1) + " | " + this.cart.get(i).getName() + " | " + this.cart.get(i).getPrice());
		}
	}
}
