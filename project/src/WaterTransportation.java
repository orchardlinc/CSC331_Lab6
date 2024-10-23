public abstract class WaterTransportation extends Transportation {
    public WaterTransportation(String name, String type, String purchaseType,
                              double cost, double speed, double distance,
                              double time, int maxPassengers) {
        super(name, type, purchaseType, cost, speed, distance, time, maxPassengers);
    }

    @Override
    public void transportationSlogan() {
        System.out.println("Water Travel - Sail The Open Ocean");
    }
}
