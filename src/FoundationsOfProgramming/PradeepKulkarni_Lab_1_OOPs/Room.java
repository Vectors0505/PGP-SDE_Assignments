package FoundationsOfProgramming.PradeepKulkarni_Lab_1_OOPs;

import java.util.Scanner;

public class Room{
	private static final Scanner sc = new Scanner(System.in);
	private final String roomNo;
	private final int occupancy;
	private final boolean hasAC;

	// basePrice is the price of occupancy 1 and for non AC room
	// we increase the price 1000 rs per occupancy and 1000 if room has AC benefit
	private final int basePrice;
	private boolean available;
	private int price;

	private Room(String roomNo, int occupancy, boolean hasAC) {
		this.roomNo = roomNo;
		this.occupancy = occupancy;
		this.hasAC = hasAC;
		this.available = true;
		this.basePrice = 2000;
	}

	// createRoom method will be called by Hotel to initialize all the rooms in the hotel
	public static Room createRoom(int floor, int roomNumberOnFloor) {
		// for now assuming the rooms on each floor won't exceed 9
		// we're storing roomNo as floor number + 0 + room number
		// example roomNo: 102 indicates 1 is the floor number and room no is 2 on that floor
		String roomNo = floor + "0" + roomNumberOnFloor;

		int occupancy;
		do {
			System.out.printf("Set occupancy for room number %s (min 1 - max 3): \n", roomNo);
			occupancy = sc.nextInt();
			switch (occupancy) {
				case 1:
				case 2:
				case 3:
					break;
				default:
					System.out.println("Please enter a valid option.");
					break;
			}
		} while (occupancy < 1 || occupancy > 3);

		int temp;
		boolean hasAC = false;
		do {
			System.out.printf("Does room %s have AC: Enter 1 for AC & 2 for Non-AC room: \n", roomNo);
			temp = sc.nextInt();
			if (temp == 1) {
				hasAC = true;
			} else if (temp == 2) {
				// if it's non-AC we have already initialized hasAC as false, so break;
				break;
			} else {
				System.out.println("Please enter a valid option.");
			}
		} while (!(temp == 1));

		Room room = new Room(roomNo, occupancy, hasAC);
		room.setPrice();
		return room;
	}

	// setPrice method to change the prices as per requirements and easy to change
	private void setPrice() {
		this.price = basePrice;
		for (int i = 1 ; i < occupancy ; i++) {
			this.price += 1000;
		}
		if (hasAC)
			this.price += 1000;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public int getOccupancy() {
		return occupancy;
	}

	public boolean isHasAC() {
		return hasAC;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getPrice() {
		return price;
	}
}
