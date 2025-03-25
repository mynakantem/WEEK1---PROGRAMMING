import java.util.Scanner;
public class TriangleAreaConverter {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the base of the triangle (in cm): ");
    double baseCm = scanner.nextDouble();

    System.out.print("Enter the height of the triangle (in cm): ");
    double heightCm = scanner.nextDouble();

    double baseInches = baseCm * 0.393701;
    double heightInches = heightCm * 0.393701;

     
    double areaCm2 = 0.5 * baseCm * heightCm;
    double areaIn2 = 0.5 * baseInches * heightInches;

      
    int heightFeet = (int) (heightInches / 12);
    double remainingInches = heightInches % 12;

     
    System.out.println("The area of the triangle is: " + areaCm2 + " square cm and " + areaIn2 + " square inches.");
    System.out.println("Your Height in cm is " + heightCm + ", while in feet is " + heightFeet + " feet " + String.format("%.2f", remainingInches) + " inches.");

        
    scanner.close();
    }
}
