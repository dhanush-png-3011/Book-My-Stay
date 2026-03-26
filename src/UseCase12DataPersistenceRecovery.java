public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery\n");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService service = new FilePersistenceService();

        String filePath = "inventory.txt";

        service.loadInventory(inventory, filePath);

        System.out.println("\nCurrent Inventory:");

        System.out.println("Single: " + inventory.getRoomAvailability().get("Single"));
        System.out.println("Double: " + inventory.getRoomAvailability().get("Double"));
        System.out.println("Suite: " + inventory.getRoomAvailability().get("Suite"));

        service.saveInventory(inventory, filePath);
    }
}