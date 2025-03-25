import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] multiplicationResult = new int[4];

        for (int i = 0, multiplier = 6; multiplier <= 9; i++, multiplier++) {
            multiplicationResult[i] = number * multiplier;
        }

        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 0, multiplier = 6; multiplier <= 9; i++, multiplier++) {
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}
