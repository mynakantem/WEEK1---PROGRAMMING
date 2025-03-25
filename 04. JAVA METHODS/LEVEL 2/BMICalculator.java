import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; 
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9) return "Normal";
        else if (bmi >= 25.0 && bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] persons = new double[10][3]; 
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = scanner.nextDouble();

            // Calculate BMI
            persons[i][2] = calculateBMI(persons[i][0], persons[i][1]);
            bmiStatus[i] = getBMIStatus(persons[i][2]);
        }

        System.out.println("\nBMI Analysis of 10 Persons:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    persons[i][0], persons[i][1], persons[i][2], bmiStatus[i]);
        }

        scanner.close();
    }
}
