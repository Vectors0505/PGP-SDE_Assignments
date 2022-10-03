package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

public class VegetarianPizza extends Pizza{
	private static final String name = "Vegetarian pizza";

	public VegetarianPizza() {
		super(20);
	}

	@Override
	public void getDescription() {
		System.out.printf("Pizza type: %s %n", VegetarianPizza.name);
		super.getDescription();
	}
}
