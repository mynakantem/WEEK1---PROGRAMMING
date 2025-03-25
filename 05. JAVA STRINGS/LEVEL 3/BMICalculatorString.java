import java.util.Scanner;

public class BMICalculatorString {

    public static String[][] calculateBMI(double[][] data) {
        int numPeople = data.length;
        String[][] results = new String[numPeople][4]; 

        for (int i = 0; i < numPeople; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100; 

            double bmi = weight / (heightMeters * heightMeters);
            bmi = Math.round(bmi * 100.0) / 100.0; 

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", data[i][1]); // Height in cm
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Report:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s | %-8s | %-8s | %-15s\n", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("--------------------------------------------------");

        for (String[] person : results) {
            System.out.printf("%-10s | %-8s | %-8s | %-15s\n", person[0], person[1], person[2], person[3]);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = 10; // Fixed number of people
        double[][] data = new double[numPeople][2]; 

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        scanner.close();

        String[][] results = calculateBMI(data);

        displayResults(results);
    }
}
