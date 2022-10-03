package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

public class RedSaucePasta extends Pasta{
	private static final String name = "Red sauce";

	public RedSaucePasta() {
		super(20);
	}

	@Override
	public void getDescription() {
		System.out.printf("Sauce: %s %n", RedSaucePasta.name);
		super.getDescription();
	}
}
