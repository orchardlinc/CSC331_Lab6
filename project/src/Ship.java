public class Ship extends WaterTransportation {
    public Ship(String name, String type, String purchaseType,
                double cost, double speed, double distance,
                double time, int maxPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, maxPassengers);
    }

    @Override
    public void travelInstructions() {
        System.out.println("Departs from the port at noon.");
    }
}
