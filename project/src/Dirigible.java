public class Dirigible extends AirTransportation {
    public Dirigible(String name, String type, String purchaseType,
                             double cost, double speed, double distance,
                             double time, int numPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, numPassengers);
    }

    @Override
    public void travelInstructions() {
        System.out.println("[TRAVEL INSTRUCTIONS FOR DIRIGIBLE]");
    }
}
