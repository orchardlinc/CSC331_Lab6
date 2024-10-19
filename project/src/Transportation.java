public abstract class Transportation {
    private String name;
    private String type;
    private String purchaseType;
    private double cost;
    private double speed;
    private double distance;
    private double time;
    private int numPassengers;

    public Transportation(String name, String type, String purchaseType,
                          double cost, double speed, double distance,
                          double time, int numPassengers) {
        this.name = name;
        this.type = type;
        this.purchaseType = purchaseType;
        this.cost = cost;
        this.speed = speed;
        this.distance = distance;
        this.time = time;
        this.numPassengers = numPassengers;
    }

    public String getName() {return name;}
    public String getType() {return type;}
    public String getPurchaseType() {return purchaseType;}
    public double getCost() {return cost;}
    public double getSpeed() {return speed;}
    public double getDistance() {return distance;}
    public double getTime() {return time;}
    public int getNumPassengers() {return numPassengers;}

    public void setName(String name) {this.name = name;}
    public void setType(String type) {this.type = type;}
    public void setPurchaseType(String purchaseType) {this.purchaseType = purchaseType;}
    public void setCost(double cost) {this.cost = cost;}
    public void setSpeed(double speed) {this.speed = speed;}
    public void setDistance(double distance) {this.distance = distance;}
    public void setTime(double time) {this.time = time;}
    public void setNumPassengers(int numPassengers) {this.numPassengers = numPassengers;}

    public double avgSpeed() {return distance / time;}

    public abstract void transportationDescription();
    public abstract void travelInstructions();

    @Override
    public String toString() {
        return String.format("%s%s%s%f%f%f%f%d%f", this.name, this.type, this.purchaseType,
                this.cost, this.speed, this.distance,
                this.time, this.numPassengers, avgSpeed());
    }
}
