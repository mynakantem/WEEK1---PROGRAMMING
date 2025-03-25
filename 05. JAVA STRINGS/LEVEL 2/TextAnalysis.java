import java.util.Scanner;

public class TextAnalysis {
    
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
        words[wordIndex] = text.substring(start); // Last word
        return words;
    }

    public static String[][] storeWordsWithLength(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Word
            wordLengths[i][1] = String.valueOf(findStringLength(words[i])); 
        }
        return wordLengths;
    }

    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (int i = 1; i < wordLengths.length; i++) {
            if (findStringLength(wordLengths[i][0]) < findStringLength(shortest)) {
                shortest = wordLengths[i][0];
            }
            if (findStringLength(wordLengths[i][0]) > findStringLength(longest)) {
                longest = wordLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = customSplit(text);

        String[][] wordLengths = storeWordsWithLength(words);

        String[] result = findShortestAndLongest(wordLengths);

        System.out.println("\nWord Length Table:");
        for (String[] row : wordLengths) {
            System.out.println(row[0] + " -> " + row[1] + " characters");
        }

        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        scanner.close();
    }
}
