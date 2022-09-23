package FoundationsOfProgramming.PradeepKulkarni_Lab_1_OOPs;

import java.util.Scanner;

// DriverClass, consider it as a main class
// main method from this class should be executed first to take Hotel, Room and BookingRequest inputs
public class DriverClass{
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter name of the hotel: ");
		String name = sc.nextLine();

		// take input to initialize the floor number in the hotel
		System.out.println("Enter no. of floors: ");
		int floors = sc.nextInt();

		// take input to initialize how many rooms exist per floor
		// for now we are assuming no of rooms per floor is the same
		System.out.println("Enter no. of rooms per floor in the hotel: ");
		int roomsPerFloor = sc.nextInt();

		Hotel hotel = new Hotel(name, floors, roomsPerFloor);
		int temp;

		System.out.println("Hotel name : " + hotel.getName());
		do {
			// When the hotel is initialized take new booking requests as per requirement
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
