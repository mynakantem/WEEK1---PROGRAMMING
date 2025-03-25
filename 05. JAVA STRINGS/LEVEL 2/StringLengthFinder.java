import java.util.Scanner;

public class StringLengthFinder {
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
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.next();

        int calculatedLength = findStringLength(inputText);

        int builtInLength = inputText.length();

        System.out.println("\nCalculated Length (Custom Method): " + calculatedLength);
        System.out.println("Actual Length (Built-in length() Method): " + builtInLength);

        scanner.close();
}
}