import java.util.Scanner;

public class IllegalArgument {

    public static void generateException(String text, int startIndex, int endIndex) {
        System.out.println("Extracting substring from index " + startIndex + " to " + endIndex);
        String result = text.substring(startIndex, endIndex);  
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text, int startIndex, int endIndex) {
        try {
            System.out.println("Extracting substring from index " + startIndex + " to " + endIndex);
            String result = text.substring(startIndex, endIndex);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("General exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next(); 

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        try {
            generateException(text, startIndex, endIndex);
        } catch (Exception e) {
            System.out.println("Exception in generateException(): " + e);
        }

        System.out.println("\nNow handling the exception safely:\n");

        handleException(text, startIndex, endIndex);

        scanner.close();
    }
}
