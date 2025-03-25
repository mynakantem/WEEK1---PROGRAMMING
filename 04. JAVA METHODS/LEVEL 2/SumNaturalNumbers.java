import java.util.Scanner;

public class SumNaturalNumbers {
    
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
    
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }

        int sumByRecursion = sumRecursive(n);
        int sumByFormula = sumFormula(n);

        System.out.println("Sum using recursion: " + sumByRecursion);
        System.out.println("Sum using formula: " + sumByFormula);
        
        if (sumByRecursion == sumByFormula) {
            System.out.println("Both results match! ✅");
        } else {
            System.out.println("There is a mismatch! ❌");
        }

        scanner.close();
    }
}
