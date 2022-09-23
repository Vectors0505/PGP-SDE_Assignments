package FoundationsOfProgramming.PradeepKulkarni_Lab_1_OOPs;

import java.util.Scanner;

public class DriverClass{
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter name of the hotel: ");
		String name = sc.nextLine();

		System.out.println("Enter no. of floors and rooms per floor in the hotel: ");
		int floors = sc.nextInt();
		int roomsPerFloor = sc.nextInt();

		Hotel hotel = new Hotel(name, floors, roomsPerFloor);
		int temp;

		System.out.println("Hotel name : " + hotel.getName());
		do {
			System.out.print("Enter your choice:\n1. New booking request\n0. Exit\n");
			temp = sc.nextInt();
			switch (temp) {
				case 1:
					BookingRequest.getBookingRequest(hotel);
					break;
				case 0:
					break;
				default:
					System.out.println("Please enter a valid option.");
					break;
			}
		} while (temp != 0);

	}
}
