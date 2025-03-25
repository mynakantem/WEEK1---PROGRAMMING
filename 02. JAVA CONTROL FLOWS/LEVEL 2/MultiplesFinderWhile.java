import java.util.Scanner;
public class MultiplesFinderWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();
        
        // Checking if the number is valid
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a number between 1 and 99.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            
            // Looping backward from 99 to 1
			int i = 99;
            while (i >= 1) {
                if (i % number == 0) { // Checking if i is a multiple of number
                    System.out.println(i);
                }
				i--;
            }
			
        }
        
        scanner.close();
    }
}
