import java.util.Scanner;

public class CharacterFrequencyy {
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; 
            frequency[i] = 1; 

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (char c : chars) {
            if (c != '0') count++;
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] frequencyResults = findCharacterFrequency(text);

        System.out.println("\nCharacter | Frequency");
        System.out.println("--------------------");
        for (String result : frequencyResults) {
            System.out.println("    " + result.replace(":", "   |    "));
        }

        scanner.close();
    }
}
