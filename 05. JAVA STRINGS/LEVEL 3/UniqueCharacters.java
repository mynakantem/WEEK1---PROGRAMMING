import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int textLength = findLength(text);
        char[] uniqueChars = new char[textLength]; 
        int uniqueCount = 0;

        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] finalUniqueChars = new char[uniqueCount];
        for (int k = 0; k < uniqueCount; k++) {
            finalUniqueChars[k] = uniqueChars[k];
        }
        return finalUniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] uniqueCharacters = findUniqueCharacters(input);

        System.out.print("Unique characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }
    }
}
