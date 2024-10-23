public class Automobile extends LandTransportation {
    public Automobile(String name, String type, String purchaseType,
                      double cost, double speed, double distance,
                      double time, int maxPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, maxPassengers);
    }

    @Override
    public void travelInstructions() {
        System.out.println("Pick up your car at 9 A.M.");
    }
}
