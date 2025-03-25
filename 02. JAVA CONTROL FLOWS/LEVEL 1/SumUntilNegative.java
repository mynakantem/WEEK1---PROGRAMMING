import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0; // Variable to store sum

        System.out.println("Enter numbers to sum (0 or negative number to stop):");

        while (true) {
            double number = scanner.nextDouble(); 
            if (number <= 0) { 
                break;
            }
            total += number; // Add number to total
        }

        System.out.println("Total sum of the numbers entered: " + total);

        scanner.close();
    }
}
