import java.util.Scanner;

public class TravelComputate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter Traveler's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Starting City: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter Destination City: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter Distance from " + fromCity + " to " + viaCity + " (in KM): ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter Distance from " + viaCity + " to " + toCity + " (in KM): ");
        double distanceViaToFinalCity = scanner.nextDouble();

        System.out.print("Enter Time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = scanner.nextInt();

        System.out.print("Enter Time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = scanner.nextInt();

        
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

       
        double totalDistanceMiles = totalDistance * 0.621371;

        int hours = totalTime / 60;
        int minutes = totalTime % 60;

      
        System.out.println("\nTraveler: " + name);
        System.out.println("Journey: " + fromCity + " → " + viaCity + " → " + toCity);
        System.out.println("Total Distance: " + totalDistance + " KM (" + String.format("%.2f", totalDistanceMiles) + " Miles)");
        System.out.println("Total Time: " + hours + " Hours " + minutes + " Minutes");

       
        scanner.close();
    }
}
