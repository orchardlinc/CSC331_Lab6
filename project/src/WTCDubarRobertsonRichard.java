/**
 * PROGRAM PURPOSE: WTC Driver
 * Hunter Dubar, Connor Robertson, & Owen Richard
 * Date: 10-25-24
 * Section: CSC-331-002
 */

import java.util.Scanner;

public class WTCDubarRobertsonRichard {
    /**
     * Ask the user what type of transportation they want to use (Land, Air, Water).
     * In a table format, display the options for the type selected, the cost of transportation,
     * whether the purchase is for a ticket or for a rental, the average speed,
     * and the number of passengers allowed.
     * Ask the user to select which mode of transportation they want to use.
     * Ask the user to select which mode of transportation they want to use.
     * Display ALL information about the selected mode using an overridden toString method.
     * Ask the user to verify that this is the mode of transportation they want to use.
     * Ask the user how many passengers need to travel using that mode of transportation.
     * Display the total cost.
     * Display travel instructions (what time their flight leaves,
     * where they need to go to pick up a bike rental, etc.)
     * @param args default argument
     */
    public static void main(String[] args) {
        // bottom-level instances
        Automobile automobile = new Automobile("Automobile", "Land", "Car", 78.27, 65, 420, 8, 5); // DELETE WHEN FINISHED
        Bike bike = new Bike("Bike", "Land", "Bike", 30.50, 15, 42, 4.5, 1); // DELETE WHEN FINISHED
        Boat boat = new Boat(); // DELETE WHEN FINISHED
        Bus bus = new Bus("Bus", "Land", "Ticket", 2.50, 45, 60, 1.5, 100); // DELETE WHEN FINISHED
        Dirigible dirigible = new Dirigible("Dirigible", "Air", "Ticket",
                100.50, 20, 50,
                3.5, 50);
        Helicopter helicopter = new Helicopter("Helicopter", "Air", "Ticket",
                50, 35, 100,
                1, 6);
        HotAirBalloon hotAirBalloon = new HotAirBalloon("Hot Air Balloon", "Air", "Ticket",
                10, 5, 75,
                4, 4);
        Plane plane = new Plane("Plane", "Air", "Ticket",
                275.99, 100, 1250.55,
                0.5, 100);
        Ship ship = new Ship(); // DELETE WHEN FINISHED
        Submarine submarine = new Submarine(); // DELETE WHEN FINISHED
        Train train = new Train("Train", "Land", "Ticket", 94.99, 80, 300, 4.5, 500); // DELETE WHEN FINISHED

        // array to hold all instances
        // (all objects extend Object, allowing for multi-type arrays)
        Transportation[] transportationArray = {automobile, bike, boat, bus, dirigible, helicopter,
                hotAirBalloon, plane, ship, submarine, train};

        System.out.println("Welcome to the Wilmington Travel Center!\n");
        System.out.print("""
                What kind of transportation would you like to use?
                Enter Air, Land, or Water:\s""");

        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();
        System.out.println();

        if (userChoice.equalsIgnoreCase("Air")) {
            transportationArray[5].transportationSlogan();
        } else if (userChoice.equalsIgnoreCase("Land")) {
            transportationArray[0].transportationSlogan();
        } else if (userChoice.equalsIgnoreCase("Water")) {
            transportationArray[3].transportationSlogan();
        }

        if (userChoice.equalsIgnoreCase("Air" ) ||
                userChoice.equalsIgnoreCase("Land") ||
                userChoice.equalsIgnoreCase("Water")) {
            System.out.printf("%-18s%-18s%-18s%-18s%-18s%-18s%n", "Name", "Type", "Cost ($)",
                    "Purchase Type", "Avg. Speed (mph)", "Max Passengers");
            // Stack Overflow solution for string repeats (like Python's "-" * 20)
            System.out.print(new String(new char[104]).replace("\0", "-") + "\n");
            for (Transportation transportation : transportationArray) {
                if (transportation.getType().equals("Air")) {
                    System.out.printf("%-18s%-18s%-18.2f%-18s%-18.2f%-18d%n", transportation.getName(),
                            transportation.getType(), transportation.getCost(), transportation.getPurchaseType(),
                            transportation.avgSpeed(), transportation.getMaxPassengers());
                }
            }
        } else {
            System.out.println("Invalid input. Try again.");
        }
    }
}
