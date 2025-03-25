import java.util.Scanner;

public class VowelConsonantIdentifier {
    
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); 
        }
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("+--------+-------------+");
        System.out.println("| Char   | Type        |");
        System.out.println("+--------+-------------+");
        for (String[] row : data) {
            System.out.printf("|   %s    | %-11s |\n", row[0], row[1]);
        }
        System.out.println("+--------+-------------+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = analyzeString(input);

        displayTable(result);

        scanner.close();
    }
}
