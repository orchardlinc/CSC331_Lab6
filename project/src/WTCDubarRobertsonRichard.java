/**
 * PROGRAM PURPOSE: WTC Driver
 * Hunter Dubar, Connor Robertson, & Owen Richard
 * Date: 10-25-24
 * Section: CSC-331-002
 */

import java.util.Arrays;
import java.util.Scanner;

public class WTCDubarRobertsonRichard {
    /**
     * Wilmington Travel Center Program
     * @param args default argument
     */
    public static void main(String[] args) {
        // SET UP BOTTOM-LEVEL INSTANCES
        // annoying to look at so made in a separate method
        Transportation[] transportationArray = instanceSetup();

        // ASK USER THEIR PREFERRED TERRAIN
        System.out.println("Welcome to the Wilmington Travel Center!\n");
        System.out.print("""
                What kind of transportation would you like to use?
                Enter Air, Land, or Water:\s""");

        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        // if the user does not give the appropriate input, go again
        while (!userChoice.equalsIgnoreCase("Air") &&
                !userChoice.equalsIgnoreCase("Land") &&
                !userChoice.equalsIgnoreCase("Water")) {
            System.out.println("\nIncorrect input...");
            System.out.print("Enter Air, Land, or Water: ");
            userChoice = userInput.nextLine();
        }

        // DISPLAY APPROPRIATE TRANSPORTATION METHODS IN A TABLE
        System.out.printf("%n%-9s%-18s%-8s%-11s%-16s%-19s%-14s%n",
                "Number",
                "Name",
                "Type",
                "Cost ($)",
                "Purchase Type",
                "Avg. Speed (mph)",
                "Max Passengers");
        // Stack Overflow solution for string repeats (like Python's "-" * 20)
        System.out.print(new String(new char[95]).replace("\0", "-") + "\n");

        // could use a non-enhanced for-loop to keep a count as well, but less typing this way
        int count = 0;
        // will be used to track the transportation methods of the user's preferred terrain
        int[] typeArray = new int[0];

        // loops through each transportation method and only prints those applicable
        for (Transportation transportation : transportationArray) {
            if (transportation.getType().equalsIgnoreCase(userChoice)) {
                // length of the typeArray doubles as a way to easily enumerate each transportation method
                System.out.printf("%-9d%-18s%-8s%-11.2f%-16s%-19.2f%-14d%n",
                        typeArray.length + 1,
                        transportation.getName(),
                        transportation.getType(),
                        transportation.getCost(),
                        transportation.getPurchaseType(),
                        transportation.avgSpeed(),
                        transportation.getMaxPassengers());
                // no append operation in default Java, so a copy is made with an extra space
                // array is used instead of a simple check as it will be used later
                typeArray = Arrays.copyOf(typeArray, typeArray.length + 1);
                /*
                this way, a user can give a number, 1 to (number of transportation methods for said terrain), and
                have it map to its original position in the transportationArray
                 */
                typeArray[typeArray.length - 1] = count;
            }
            count += 1;
        }

        System.out.println();
        // POLYMORPHISM - same method, different output depending on class (override)
        // every method in typeArray extends the same terrain, so the first is called for simplicity's sake
        transportationArray[typeArray[0]].transportationSlogan();

        // ASK USER FOR PREFERRED METHOD OF TRANSPORTATION
        boolean unsatisfied = true;
        int userNum = 0;
        String confirm;

        while (unsatisfied) {
            System.out.print("""
                
                What method of transportation would you like to use?
                Enter the corresponding number:\s""");

            userNum = userInput.nextInt();
            userInput.nextLine();

            while (userNum < 1 || userNum > typeArray.length) {
                System.out.println("\nIncorrect input...");
                System.out.print("Enter the corresponding number: ");
                userNum = userInput.nextInt();
                userInput.nextLine();
            }

            // DISPLAY CHOSEN TRANSPORTATION METHOD
            System.out.println("\nAttributes");
            System.out.println("----------");
            System.out.print(transportationArray[typeArray[userNum - 1]]);

            // VERIFY USER'S CHOICE
            System.out.print("""
            
            Is this choice satisfactory?
            Enter yes or no:\s""");
            confirm = userInput.nextLine();

            while (!confirm.equalsIgnoreCase("Yes") &&
                    !confirm.equalsIgnoreCase("No")) {
                System.out.println("\nIncorrect input...");
                System.out.print("Enter yes or no: ");
                confirm = userInput.nextLine();
            }

            if (confirm.equalsIgnoreCase("yes")) {
                unsatisfied = false;
            }
        }

        // GET THE NUMBER OF PASSENGERS NEEDING TO TRAVEL
        System.out.print("""
                
                How many passengers are coming on this trip?
                Enter a valid number:\s""");

        int numPassengers = userInput.nextInt();
        userInput.nextLine();

        while (numPassengers < 1 ||
                numPassengers > transportationArray[typeArray[userNum - 1]].getMaxPassengers()) {
            System.out.println("\nInvalid input...");
            System.out.print("Enter a valid number: ");
            numPassengers = userInput.nextInt();
            userInput.nextLine();
        }

        // DISPLAY TOTAL COST
        System.out.print("\nTotal Cost ($): ");
        if (transportationArray[typeArray[userNum - 1]].getPurchaseType().equalsIgnoreCase("Ticket")) {
            System.out.printf("%.2f%n", transportationArray[typeArray[userNum - 1]].getCost() * numPassengers);
        } else {
            System.out.println(transportationArray[typeArray[userNum - 1]].getCost());
        }

        // DISPLAY TRAVEL INSTRUCTIONS
        System.out.print("Travel Instructions: ");
        // POLYMORPHISM - same method, different output depending on class (override)
        transportationArray[typeArray[userNum - 1]].travelInstructions();
    }

    /**
     * Set up the transportation methods.
     * @return array holding each bottom-level instance
     */
    public static Transportation[] instanceSetup() {
        // bottom-level instances
        Automobile automobile = new Automobile("Automobile", "Land", "Rental",
                78.27, 65, 420, 8, 5);
        Bike bike = new Bike("Bike", "Land", "Rental",
                30.50, 15, 42, 4.5, 1);
        Boat boat = new Boat("Boat", "Water", "Rental",
                249.99, 30, 4, 3, 10);
        Bus bus = new Bus("Bus", "Land", "Ticket",
                2.50, 45, 60, 1.5, 100);
        Dirigible dirigible = new Dirigible("Dirigible", "Air", "Ticket",
                100.50, 20, 50, 3.5, 50);
        Helicopter helicopter = new Helicopter("Helicopter", "Air", "Ticket",
                50, 35, 100, 1, 6);
        HotAirBalloon hotAirBalloon = new HotAirBalloon("Hot Air Balloon", "Air", "Ticket",
                10, 5, 75, 4, 4);
        Plane plane = new Plane("Plane", "Air", "Ticket",
                275.99, 100, 1250.55, 0.5, 100);
        Ship ship = new Ship("Ship", "Water", "Ticket",
                69.99, 25, 2, 2.5, 75);
        Submarine submarine = new Submarine("Submarine", "Water", "Ticket",
                575.10, 40, 5.5, 3.5, 25);
        Train train = new Train("Train", "Land", "Ticket",
                94.99, 80, 300, 4.5, 500);

        // array to hold all instances
        return new Transportation[] {automobile, bike, boat, bus, dirigible, helicopter,
                hotAirBalloon, plane, ship, submarine, train};
    }
}
