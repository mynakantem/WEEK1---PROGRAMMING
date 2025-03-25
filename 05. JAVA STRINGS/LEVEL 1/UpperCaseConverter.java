import java.util.Scanner;

public class UpperCaseConverter {

    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character differs
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        String manualUpperCase = convertToUpperCase(inputText);

        String builtInUpperCase = inputText.toUpperCase();

        boolean areEqual = compareStrings(manualUpperCase, builtInUpperCase);

        System.out.println("\nConverted (Manual Method): " + manualUpperCase);
        System.out.println("Converted (Built-in Method): " + builtInUpperCase);
        System.out.println("Are both methods producing the same result? " + areEqual);

        scanner.close();
    }
}
