import java.util.Scanner;

public class LeapYearCheckOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Checking if the year is valid
        if (year < 1582) {
            System.out.println("Invalid input! The year must be 1582 or later.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        scanner.close();
    }
}
