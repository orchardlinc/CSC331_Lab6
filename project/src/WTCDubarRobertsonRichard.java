public class WTCDubarRobertsonRichard {
    /**
     * Ask the user what type of transportation they want to use (Land, Air, Water).
     * In a table format, display the options for the type selected, the cost of transportation,
     * whether the purchase is for a ticket or for a rental, the average speed,
     * and the number of passengers allowed.
     * Ask the user to select which mode of transportation they want to use.
     * Display ALL information about the selected mode using an overridden toString method.
     * Ask the user to verify that this is the mode of transportation they want to use.
     * Ask the user how many passengers need to travel using that mode of transportation.
     * Display the total cost.
     * Display travel instructions (what time their flight leaves, where they need to go to pick up a bike rental,
     * etc.)
     */
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
