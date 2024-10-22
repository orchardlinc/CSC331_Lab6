public class TestFile {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon("Hot Air Balloon", "Air", "Ticket",
                10, 5, 75,
                4, 4);
        Plane plane = new Plane("Plane", "Air", "Ticket",
                275.99, 100, 1250.55,
                0.5, 100);

        Object[] transportationArray = {hotAirBalloon, plane};

        for (Object transportation : transportationArray) {
            System.out.println(((Transportation)transportation).getCost());
        }
    }
}
