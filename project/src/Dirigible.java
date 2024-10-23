public class Dirigible extends AirTransportation {
    public Dirigible(String name, String type, String purchaseType,
                     double cost, double speed, double distance,
                     double time, int maxPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, maxPassengers);
    }

    @Override
    public void travelInstructions() {
        System.out.println("Found in the open field.");
    }
}
