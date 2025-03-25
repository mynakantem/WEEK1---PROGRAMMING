import java.util.Scanner;

public class LowerCaseConverter {

    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
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
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        String manualLowerCase = convertToLowerCase(inputText);

        String builtInLowerCase = inputText.toLowerCase();

        boolean areEqual = compareStrings(manualLowerCase, builtInLowerCase);

        System.out.println("\nConverted (Manual Method): " + manualLowerCase);
        System.out.println("Converted (Built-in Method): " + builtInLowerCase);
        System.out.println("Are both methods producing the same result? " + areEqual);

        scanner.close();
    }
}
