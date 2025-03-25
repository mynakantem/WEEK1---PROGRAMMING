import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0; // Initialize bonus to 0

        // Check if employee has more than 5 years of service
        if (yearsOfService > 5) {
            bonus = 0.05 * salary; // 5% of salary
            System.out.println("Congratulations! Your bonus amount is: " + bonus);
        } else {
            System.out.println("Sorry, no bonus. You need more than 5 years of service.");
        }

        scanner.close();
    }
}
