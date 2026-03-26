public static void printRoom(String type, Room room, RoomInventory inventory) {

    System.out.println(type + " Room:");
    room.displayRoomDetails();
    System.out.println("Available Rooms: " + inventory.getRoomAvailability().get(type));
    System.out.println();
}

void main() {
}