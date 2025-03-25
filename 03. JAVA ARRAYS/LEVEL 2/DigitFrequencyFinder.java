import java.util.Scanner;

public class DigitFrequencyFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();  

        int[] frequency = new int[10]; 

        long temp = Math.abs(number); // Handle negative numbers
        while (temp > 0) {
            int digit = (int) (temp % 10); // Extract last digit
            frequency[digit]++; // Increment frequency of that digit
            temp /= 10; // Remove last digit
        }

        System.out.println("\nDigit Frequency in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " => " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}
