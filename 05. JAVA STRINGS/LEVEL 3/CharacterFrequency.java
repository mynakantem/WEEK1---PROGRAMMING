import java.util.Scanner;

public class CharacterFrequency {
    
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int index = 0;
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < index; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }
        
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }

    public static void displayFrequencyTable(String[][] frequencyTable) {
        System.out.println("Character | Frequency");
        System.out.println("--------------------");
        
        for (String[] row : frequencyTable) {
            System.out.printf("    %s     |     %s\n", row[0], row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[][] frequencyTable = findCharacterFrequency(text);
        displayFrequencyTable(frequencyTable);
        
        scanner.close();
    }
}
