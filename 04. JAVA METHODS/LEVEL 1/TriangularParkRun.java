import java.util.Scanner;

public class TriangularParkRun {
    
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; 
        return (int) Math.ceil(5000 / perimeter); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

       
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || 
            (side1 + side2 <= side3) || (side2 + side3 <= side1) || (side1 + side3 <= side2)) {
            System.out.println("Invalid triangle dimensions. Please enter valid sides.");
        } else {
            
            int rounds = calculateRounds(side1, side2, side3);
            System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        }

        scanner.close();
    }
}
