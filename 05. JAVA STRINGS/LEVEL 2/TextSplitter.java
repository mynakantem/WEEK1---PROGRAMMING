import java.util.Scanner;
import java.util.Arrays;

public class TextSplitter {

    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++; // Increment count
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when charAt() goes beyond the string length
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

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        String[] builtInSplit = inputText.split(" ");

        String[] customSplit = customSplit(inputText);

        boolean areEqual = compareArrays(builtInSplit, customSplit);

        System.out.println("\nBuilt-in split() Result: " + Arrays.toString(builtInSplit));
        System.out.println("Custom split() Result: " + Arrays.toString(customSplit));
        System.out.println("\nAre both methods producing the same result? " + areEqual);

        scanner.close();
    }
}
