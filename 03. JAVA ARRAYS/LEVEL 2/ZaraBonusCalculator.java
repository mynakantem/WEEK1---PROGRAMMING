import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            
            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Salary must be positive and years of service cannot be negative. Please re-enter.");
                i--; // Decrement index to re-enter details for the same employee
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }

            newSalaries[i] = salaries[i] + bonuses[i]; // Calculate new salary

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Employee Salary & Bonus Details ---");
        System.out.printf("%-10s %-15s %-10s %-10s\n", "Emp No", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%-10d %-15.2f %-10.2f %-10.2f\n", (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Paid by Zara: " + totalBonus);
        System.out.println("Total Old Salary of Employees: " + totalOldSalary);
        System.out.println("Total New Salary of Employees: " + totalNewSalary);

        scanner.close();
    }
}
