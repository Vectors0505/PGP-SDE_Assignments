package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project.Question2VendingMachine;

public class CardPayment implements PaymentMethod{
	@Override
	public double calculatePrice(Cart cart) {
		return cart.getTotalPrice() * 2;
	}

	@Override
	public void makePayment(Cart cart) {
		System.out.printf("Payment of %.2f successful for %d items.", calculatePrice(cart), cart.getCount());
		cart.removeAll();
	}
}
