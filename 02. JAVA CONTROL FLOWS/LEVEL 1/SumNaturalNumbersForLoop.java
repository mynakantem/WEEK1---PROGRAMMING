import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            // Compute sum using for loop
            int sumUsingLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingLoop += i;
            }

            // Compute sum using formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Display both results
            System.out.println("Sum using for loop: " + sumUsingLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            // Compare both results
            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations match. The result is correct!");
            } else {
                System.out.println("There is a mismatch. Please check the calculations.");
            }
        }

        scanner.close();
    }
}
