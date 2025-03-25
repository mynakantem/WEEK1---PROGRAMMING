import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;  

        System.out.println("Enter numbers (0 or negative to stop, max 10 numbers):");
		
        while (true) {
            if (index >= 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }
            numbers[index] = input;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("\nStored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nTotal sum: " + total);

        scanner.close();
    }
}
