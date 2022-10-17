package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project.Question2VendingMachine;

// All objects in vending machine will extend this class and have same functionalities
abstract class VendingMachineProduct{
	private final String name;
	private final double price;

	VendingMachineProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
