import java.util.Scanner;

public class NumberFormatException {

    public static void generateException() {
        String invalidNumber = "123abc";
        int num = Integer.parseInt(invalidNumber); 
        System.out.println("Converted Number: " + num); 
    }

    public static void handleException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        try {
            int number = Integer.parseInt(userInput); 
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format! Please enter digits only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) { 
  
        handleException();
    }
}

