package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

import java.util.Scanner;

abstract class Pizza implements BakeAble{
	private static final Scanner sc = new Scanner(System.in);
	private static final String[] toppings = {"Cheese", "Mushroom", "Tomato", "Jalapeno", "Spinach"};
	private final double basePrice;
	private final boolean[] selectedToppings = new boolean[5];
	private int crustType;
	private double finalPrice;
	private int size;

	public Pizza(double basePrice) {
		this.basePrice = basePrice;
		this.setCrustType();
		this.setSize();
		this.setSelectedToppings();
		this.setPrice();
	}

	private void setSelectedToppings() {
		int temp;
		do {
			System.out.println("Add extra toppings:");
			for (int i = 0 ; i < Pizza.toppings.length ; i++) {
				System.out.printf("%d. %s %n", i + 1, Pizza.toppings[i]);
			}
			System.out.println("Press 6 to exit topping menu");
			temp = sc.nextInt();

			if (temp < 1 || temp > 6) {
				System.out.println("Please select a valid choice of topping.");
			} else if (temp <= 5) {
				if (this.selectedToppings[temp - 1]){
					System.out.println("Topping already added");
				}
				this.selectedToppings[temp - 1] = true;
			}
		} while (temp != 6);
	}

	private void setCrustType() {
		int temp;
		do {
			System.out.println("Enter your choice of crust:");
			System.out.println("1. Thin");
			System.out.println("2. Thick");
			temp = sc.nextInt();

			if (temp < 1 || temp > 2) {
				System.out.println("Please enter a valid choice of crust.");
			}
		} while (temp < 1 || temp > 2);
		this.crustType = temp;
	}

	private void setSize() {
		int temp;
		do {
			System.out.println("Enter your choice of size:");
			System.out.println("1. Small");
			System.out.println("2. Medium");
			System.out.println("3. Large");
			temp = sc.nextInt();

			if (temp < 1 || temp > 3) {
				System.out.println("Please enter a valid choice for size.");
			}
		} while (temp < 1 || temp > 3);
		this.size = temp;
	}

	private void setPrice() {
		for (int i = 1 ; i <= this.size ; i++) {
			this.finalPrice += basePrice;
		}
		for (boolean selectedTopping : this.selectedToppings) {
			if (selectedTopping) {
				this.finalPrice += 1;
			}
		}
	}

	@Override
	public void bake() {
		System.out.println("Baking the ordered pizza.");
	}

	@Override
	public double getPrice() {
		return this.finalPrice;
	}

	private String getCrustType() {
		if (this.crustType == 1) {
			return "Thin";
		}
		return "Thick";
	}

	private String getSize() {
		if (this.size == 1) {
			return "Small";
		} else if (this.size == 2) {
			return "Medium";
		}
		return "Large";
	}

	@Override
	public void getDescription() {
		System.out.printf("Crust: %s %n", getCrustType());
		System.out.printf("Size: %s %n", getSize());
		System.out.printf("Price: %.2f %n", getPrice());
		this.printToppings();
	}

	public void printToppings() {
		System.out.println("Toppings Added");
		for (int i = 0 ; i < toppings.length ; i++) {
			if (selectedToppings[i]) {
				System.out.println(toppings[i]);
			}
		}
	}
}
