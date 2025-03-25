import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3; 
        double distanceInMiles = distanceInYards / 1760; 

        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        double heightInches = heightCm * 0.393701;
        int heightFeet = (int) (heightInches / 12); 
        double remainingInches = heightInches % 12;

        System.out.println("The distance in yards is: " + distanceInYards + " yards.");
        System.out.println("The distance in miles is: " + distanceInMiles + " miles.");
        System.out.println("Your Height in cm is " + heightCm + ", while in feet is " + heightFeet + " feet " + String.format("%.2f", remainingInches) + " inches.");

        scanner.close();
    }
}