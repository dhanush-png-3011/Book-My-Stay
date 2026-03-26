public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation\n");

        RoomInventory inventory = new RoomInventory();

        CancellationService service = new CancellationService();

        service.registerBooking("Single-1", "Single");

        service.cancelBooking("Single-1", inventory);

        service.showRollbackHistory();

        System.out.println("\nUpdated Single Room Availability: " +
                inventory.getRoomAvailability().get("Single"));
    }
}