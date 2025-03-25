import java.util.Scanner;
public class GreatestFactorFinderWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
		
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; // Initialize the greatest factor variable
			
            while ( i >= 1) {
                if (number % i == 0) { // Check if it's a factor
                    greatestFactor = i; // Assign it as the greatest factor
                    break; // Exit the loop once the largest factor is found
                }
				i--;
            }
			      

            // Display the result
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }

        scanner.close();
    }
}
