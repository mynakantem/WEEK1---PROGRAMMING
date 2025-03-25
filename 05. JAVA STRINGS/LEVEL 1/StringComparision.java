import java.util.Scanner;

public class StringComparison {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean resultCustom = compareStrings(str1, str2);
        boolean resultBuiltIn = str1.equals(str2);

        System.out.println("Custom Method Result: " + resultCustom);
        System.out.println("Built-in equals() Method Result: " + resultBuiltIn);

        if (resultCustom == resultBuiltIn) {
            System.out.println("Both methods returned the same result!");
        } else {
            System.out.println("Mismatch in results. Check the logic!");
        }

        scanner.close();
    }
}
