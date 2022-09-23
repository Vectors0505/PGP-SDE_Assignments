package FoundationsOfProgramming.PradeepKulkarni_Lab_1_OOPs;

import java.util.Scanner;

// class to create a new booking request
public class BookingRequest{
	private static final Scanner sc = new Scanner(System.in);
	private int occupancy;
	private boolean hasAC;

	// method will get the details of the booking request and call method in Hotel to check if
	// room is available as per the requirements
	public static void getBookingRequest(Hotel hotel) {
		BookingRequest newReq = new BookingRequest();

		// get input for occupancy requirement
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

		// get input for AC requirement
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

		// get input to check if they have any specific floor request
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

		// if the customer has any specific floor request if-command block will execute
		// else room will be allocated at any floor
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
