package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

public class WhiteSaucePasta extends Pasta{
	private static final String name = "White sauce";

	public WhiteSaucePasta() {
		super(10);
	}

	@Override
	public void getDescription() {
		System.out.printf("Sauce: %s %n", WhiteSaucePasta.name);
		super.getDescription();
	}
}
