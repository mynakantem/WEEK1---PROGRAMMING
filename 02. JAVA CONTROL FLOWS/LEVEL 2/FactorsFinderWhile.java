import java.util.Scanner;

public class FactorsFinderWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
                
            while ( i < number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
			i++;
        }
        
        scanner.close();
    }
}
