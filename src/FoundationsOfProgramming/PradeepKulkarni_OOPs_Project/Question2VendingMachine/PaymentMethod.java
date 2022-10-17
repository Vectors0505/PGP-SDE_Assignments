package FoundationsOfProgramming.PradeepKulkarni_OOPs_Project.Question2VendingMachine;

// Payment method is and interface and implemented by two classes for payments using Cash and Card
interface PaymentMethod{
	double calculatePrice(Cart cart);

	void makePayment(Cart cart);
}
