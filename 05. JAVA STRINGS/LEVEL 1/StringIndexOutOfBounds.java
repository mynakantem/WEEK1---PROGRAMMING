import java.util.Scanner;

public class StringIndexOutOfBounds {

    public static void generateException(String text) {
        int length = text.length();  
        System.out.println("Accessing character at index " + length); 
        System.out.println("Character: " + text.charAt(length)); 
    }

    public static void handleException(String text) {
        int length = text.length(); 
        try {
            System.out.println("Accessing character at index " + length);
            System.out.println("Character: " + text.charAt(length)); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception in generateException(): " + e);
        }

        System.out.println("\nNow handling the exception safely:\n");

        handleException(text);

        scanner.close();
    }
}
