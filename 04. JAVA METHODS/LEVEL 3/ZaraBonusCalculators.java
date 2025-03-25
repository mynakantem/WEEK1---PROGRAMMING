import java.util.Random;

public class ZaraBonusCalculators {

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees); 
        double[][] updatedData = calculateBonus(employeeData); 

        displayResults(employeeData, updatedData); 
    }

    public static double[][] generateEmployeeData(int num) {
        Random random = new Random();
        double[][] data = new double[num][2];

        for (int i = 0; i < num; i++) {
            data[i][0] = 10000 + random.nextInt(90000); 
            data[i][1] = random.nextInt(11); 
        }

        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        int num = data.length;
        double[][] updatedData = new double[num][2];

        for (int i = 0; i < num; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            updatedData[i][0] = bonusAmount;
            updatedData[i][1] = newSalary;
        }

        return updatedData;
    }

    public static void displayResults(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Years of Service", "Bonus", "New Salary", "Bonus %");
        System.out.println("--------------------------------------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];
            double bonusPercent = (years > 5) ? 5 : 2;

            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15.2f %-15.0f%%\n", (i + 1), oldSalary, years, bonus, newSalary, bonusPercent);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }
}
