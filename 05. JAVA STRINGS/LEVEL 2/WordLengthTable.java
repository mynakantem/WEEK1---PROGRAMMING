import java.util.Scanner;

public class WordLengthTable {

    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++; 
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int length = findStringLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(start, i); 
                wordIndex++;
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, length); 

        return words;
    }

    public static String[][] generateWordLengthArray(String[] words) {
        int numWords = words.length;
        String[][] wordLengthArray = new String[numWords][2];

        for (int i = 0; i < numWords; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); 
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        String[] words = customSplit(inputText);

        String[][] wordLengthTable = generateWordLengthArray(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (String[] row : wordLengthTable) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1])); // Convert length back to Integer
        }

        scanner.close();
    }
}
