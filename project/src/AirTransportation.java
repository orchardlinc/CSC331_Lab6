public abstract class AirTransportation extends Transportation {
    public AirTransportation(String name, String type, String purchaseType,
                             double cost, double speed, double distance,
                             double time, int numPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, numPassengers);
    }

    @Override
    public void transportationSlogan() {
        System.out.println("Reaching New Heights");
    }
}
