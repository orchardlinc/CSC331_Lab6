public class WTCDubarRobertsonRichard {
    public static void main(String[] args) {
        // method testing>>>
        Dirigible dirigible = new Dirigible("Dirigible", "Air", "Ticket",
                100.50, 20, 50,
                3.5, 50);
        System.out.println(dirigible);
        dirigible.transportationSlogan();
        dirigible.travelInstructions();
    }
}
