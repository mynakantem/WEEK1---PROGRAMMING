import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false; 
        return isPalindromeRecursive(text, start + 1, end - 1); 
    }

    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Normalize text

        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultCharArray = isPalindromeCharArray(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Iterative Method: " + (resultIterative ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Recursive Method: " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Character Array Method: " + (resultCharArray ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
