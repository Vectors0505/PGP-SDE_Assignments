package FoundationsOfProgramming.PradeepKulkarni_Lab_1_OOPs;

public class Hotel{
	private final int floors;
	// array for rooms where each row represents a floor and each column represents room on that floor
	// can convert to ArrayList if we want to modify no of rooms
	private final Room[][] rooms;
	private final String name;
	// member variables are final because we don't intend to make changes in floors, rooms and name at this moment

	// Constructor for Hotel class, it will also initialize rooms in that Hotel by calling createRoom for each room
	public Hotel(String name, int floors, int roomsPerFloor) {
		this.name = name;
		this.floors = floors;
		this.rooms = new Room[floors][roomsPerFloor];
		for (int floor = 0 ; floor < rooms.length ; floor++) {
			for (int room = 0 ; room < roomsPerFloor ; room++) {
				rooms[floor][room] = Room.createRoom(floor + 1, room + 1);
			}
		}
	}

	public int getFloors() {
		return floors;
	}

	public String getName() {
		return name;
	}

	// method to check if there is room available as per request and book it
	public boolean checkAvailabilityAndBook(int floor, int occupancy, boolean hasAC) {
		for (int i = 0 ; i < rooms[floor].length ; i++) {
			if (rooms[floor][i].isAvailable()) {
				if (rooms[floor][i].getOccupancy() == occupancy && hasAC == rooms[floor][i].isHasAC()) {
					rooms[floor][i].setAvailable(false);
					System.out.printf("Room number: %s, floor number: %d, air conditioned: %b, occupancy: %d, estimated: %d/day\n",
							rooms[floor][i].getRoomNo(), floor + 1, hasAC, occupancy, rooms[floor][i].getPrice());
					return true;
				}
			}
		}
		return false;
	}
}
