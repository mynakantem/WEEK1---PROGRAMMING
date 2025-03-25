import java.util.Scanner;
public class TriangularRun {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter side1 (in meters):");
double side1 = scanner.nextDouble();

System.out.print("Enter side2(in meters):");
double side2 = scanner.nextDouble();

System.out.print("Enter side3 (in meters):");
double side3 = scanner.nextDouble();

double perimeter = side1 + side2 + side3;
double totalDistance = 5 * 1000;
double rounds = totalDistance / perimeter;

System.out.println("\nThe total number of rounds the athlete will run is: " + Math.ceil(rounds) + " rounds to complete 5 km.");

scanner.close();
}
}