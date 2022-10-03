package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

public class NonVegPizza extends Pizza{
	private static final String name = "Non-Vegetarian pizza";

	public NonVegPizza() {
		super(25);
	}

	@Override
	public void getDescription() {
		System.out.printf("Pizza type: %s %n", NonVegPizza.name);
		super.getDescription();
	}
}
