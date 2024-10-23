public abstract class Transportation {
    private String name;
    private String type;
    private String purchaseType;
    private double cost;
    private double speed;
    private double distance;
    private double time;
    private int maxPassengers;

    public Transportation(String name, String type, String purchaseType,
                          double cost, double speed, double distance,
                          double time, int maxPassengers) {
        this.name = name;
        this.type = type;
        this.purchaseType = purchaseType;
        this.cost = cost;
        this.speed = speed;
        this.distance = distance;
        this.time = time;
        this.maxPassengers = maxPassengers;
    }

    public String getName() {return name;}
    public String getType() {return type;}
    public String getPurchaseType() {return purchaseType;}
    public double getCost() {return cost;}
    public double getSpeed() {return speed;}
    public double getDistance() {return distance;}
    public double getTime() {return time;}
    public int getMaxPassengers() {return maxPassengers;}

    public void setName(String name) {this.name = name;}
    public void setType(String type) {this.type = type;}
    public void setPurchaseType(String purchaseType) {this.purchaseType = purchaseType;}
    public void setCost(double cost) {this.cost = cost;}
    public void setSpeed(double speed) {this.speed = speed;}
    public void setDistance(double distance) {this.distance = distance;}
    public void setTime(double time) {this.time = time;}
    public void setMaxPassengers(int numPassengers) {this.maxPassengers = numPassengers;}

    public double avgSpeed() {return distance / time;}

    public abstract void transportationSlogan();
    public abstract void travelInstructions();

    @Override
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%s%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%s%d%n%s%.2f%n",
                "Name: ", this.name,
                "Type: ", this.type,
                "Purchase Type (Ticket/Rental): ", this.purchaseType,
                "Cost: ", this.cost,
                "Speed (mph): ", this.speed,
                "Distance (mi): ", this.distance,
                "Time (hr): ", this.time,
                "Max Passengers: ", this.maxPassengers,
                "Average Speed (mph): ", avgSpeed());
    }
}
