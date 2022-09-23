package FoundationsOfProgramming.PradeepKulkarni_Lab_1_OOPs;

import java.util.Scanner;

public class BookingRequest{
	private static final Scanner sc = new Scanner(System.in);
	private int occupancy;
	private boolean hasAC;

	public static void getBookingRequest(Hotel hotel) {
		BookingRequest newReq = new BookingRequest();

		do {
			System.out.println("What is the occupancy required? 1. Single 2. Double 3. Triple: ");
			newReq.occupancy = sc.nextInt();
			switch (newReq.occupancy) {
				case 1:
				case 2:
				case 3:
					break;
				default:
					System.out.println("Please enter a valid option.");
					break;
			}
		} while (newReq.occupancy < 1 || newReq.occupancy > 3);

		int temp;
		do {
			System.out.println("Enter 1 for AC & 2 for Non-AC room: ");
			temp = sc.nextInt();
			if (temp == 1) {
				newReq.hasAC = true;
			} else if (temp == 2) {
				newReq.hasAC = false;
			} else {
				System.out.println("Please enter a valid option.");
			}
		} while (!(temp == 1) && !(temp == 2));

		do {
			System.out.println("Enter 1 for any specific floor request & 2 if there is no specific request: ");
			temp = sc.nextInt();
			switch (temp) {
				case 1:
				case 2:
					break;
				default:
					System.out.println("Please enter a valid option.");
					break;
			}
		} while (!(temp == 1) && !(temp == 2));

		boolean booked = false;
		if (temp == 1) {
			do {
				System.out.printf("Enter requested floor number (%d - %d): ", 1, hotel.getFloors());
				temp = sc.nextInt();
				if (temp >= 1 && temp <= hotel.getFloors()) {
					booked = hotel.checkAvailabilityAndBook(temp - 1, newReq.occupancy, newReq.hasAC);
					break;
				} else {
					System.out.println("Please enter a valid option.");
				}
			} while (!(temp >= 1 && temp <= hotel.getFloors()));
		} else {
			for (int i = 0 ; i < hotel.getFloors() ; i++) {
				booked = hotel.checkAvailabilityAndBook(i, newReq.occupancy, newReq.hasAC);
				if (booked)
					break;
			}
		}

		if (!booked) {
			System.out.println("Room not available");
		}
	}
}
