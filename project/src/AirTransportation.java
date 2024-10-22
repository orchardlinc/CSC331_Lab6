public abstract class AirTransportation extends Transportation {
    public AirTransportation(String name, String type, String purchaseType,
                             double cost, double speed, double distance,
                             double time, int maxPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, maxPassengers);
    }

    @Override
    public void transportationSlogan() {
        System.out.println("Air Travel - Reaching New Heights");
    }
}
