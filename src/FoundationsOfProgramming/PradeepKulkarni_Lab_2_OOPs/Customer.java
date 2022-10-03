package FoundationsOfProgramming.PradeepKulkarni_Lab_2_OOPs;

import java.util.Scanner;

public class Customer{
	private static final Scanner sc = new Scanner(System.in);
	private String name;
	private String mobileNo;

	public Customer() {
		setName();
		setMobileNo();
	}

	public void newOrder() {
		OrderRequest newReq = new OrderRequest();

		System.out.printf("Customer name & mobile number: %s %s%n", this.getName(), this.getMobileNo());
		newReq.notifyCustomer();

		System.out.println("Please pay your bill using cash/card");
	}

	public String getName() {
		return name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	private void setName() {
		System.out.print("Please enter your name: ");
		this.name = sc.nextLine();
	}

	private void setMobileNo() {
		System.out.print("Please enter valid 10 digit mobile number: ");
		this.mobileNo = sc.nextLine();
	}
}
