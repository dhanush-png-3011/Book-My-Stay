public class InventorySetup {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("Hotel Room Inventory Status\n");

        printRoom("Single", single, inventory);
        printRoom("Double", doubleRoom, inventory);
        printRoom("Suite", suite, inventory);
    }

    public static void printRoom(String type, Room room, RoomInventory inventory) {

        System.out.println(type + " Room:");
        room.displayRoomDetails();
        System.out.println("Available Rooms: " + inventory.getAvailability(type));
        System.out.println();
    }
}