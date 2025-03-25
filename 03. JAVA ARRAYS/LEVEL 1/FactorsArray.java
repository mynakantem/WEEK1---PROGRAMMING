import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define initial array size and variables
        int maxFactor = 10; // Initial array size
        int[] factors = new int[maxFactor];
        int index = 0; // To track stored factors

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor
                if (index == maxFactor) { 
                    // Resize array if full
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy old factors into new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                // Store the factor
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        scanner.close();
    }
}
