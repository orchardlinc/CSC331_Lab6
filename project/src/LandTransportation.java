public abstract class LandTransportation extends Transportation {
    public LandTransportation(String name, String type, String purchaseType,
                             double cost, double speed, double distance,
                             double time, int maxPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, maxPassengers);
    }

    @Override
    public void transportationSlogan() {
        System.out.println("\"Land Travel - Exploring New Roads\"");
    }
}
