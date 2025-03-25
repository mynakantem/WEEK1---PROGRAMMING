import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number (1 or greater).");
        } else {
            System.out.println("Odd and Even numbers from 1 to " + number + ":");

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) { // Check if even
                    System.out.println(i + " is an Even number");
                } else { // Otherwise, it's odd
                    System.out.println(i + " is an Odd number");
                }
            }
        }

        scanner.close();
    }
}
