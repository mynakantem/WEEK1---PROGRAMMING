import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Accessing invalid index: " + names[5]); 
    }

    public static void handleException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter index to access (0-2): ");
        int index = scanner.nextInt();  

        try {
            System.out.println("Name at index " + index + ": " + names[index]); 
        } catch (Exception e) {  
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) { 
      
        handleException();
    }
}
