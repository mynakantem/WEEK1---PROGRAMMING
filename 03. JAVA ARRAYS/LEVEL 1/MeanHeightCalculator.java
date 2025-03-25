import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];

        System.out.println("Enter the heights of 11 football players (in cm):");
		
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];  
        }

        double meanHeight = sum / 11;

        System.out.println("\nThe mean height of the football team is: " + meanHeight + " cm");

        scanner.close();
    }
}
