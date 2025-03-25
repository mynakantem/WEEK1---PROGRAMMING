import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; 
            int i = 1; 

         
            while (i <= number) {
                factorial *= i; 
                i++; 
            }

       
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
