import java.util.Scanner;

public class StringAnalyser {
    public static int[] findAllIndexes(String text, char ch) {
        int count = 0;

        // Count occurrences of 'ch' in 'text'
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        int[] indexes = new int[count]; // Create array of correct size
        int j = 0;

        // Store the actual indexes where 'ch' appears
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                indexes[j] = i; // Store the index instead of '1'
                j++;
            }
        }

        return indexes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a character to find the occurrences: ");
        char ch = scanner.next().charAt(0);

        int[] indexes = findAllIndexes(text, ch);

        System.out.println("Indexes of the character '" + ch + "':");
        for (int i = 0; i < indexes.length; i++) {
            System.out.print(indexes[i] + " ");
        }
        
        scanner.close(); // Close scanner to avoid resource leaks
    }
}
