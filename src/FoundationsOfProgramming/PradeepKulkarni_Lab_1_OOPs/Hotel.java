package FoundationsOfProgramming.PradeepKulkarni_Lab_1_OOPs;

public class Hotel{
	private final int floors;
	private final Room[][] rooms;
	private final String name;

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
