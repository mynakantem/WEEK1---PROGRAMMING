import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0, originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10; 
            sum += Math.pow(digit, 3);       
            originalNumber /= 10;          
        }
		
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        scanner.close();
    }
}
