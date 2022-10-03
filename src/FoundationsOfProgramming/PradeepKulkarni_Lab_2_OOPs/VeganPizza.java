package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

public class VeganPizza extends Pizza{
	private static final String name = "Vegan pizza";

	public VeganPizza() {
		super(15);
	}

	@Override
	public void getDescription() {
		System.out.printf("Pizza type: %s %n", VeganPizza.name);
		super.getDescription();
	}
}
