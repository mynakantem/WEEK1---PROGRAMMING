import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            int sumUsingLoop = 0;
            int i = 1;
            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }
			
            int sumUsingFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumUsingLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations match. The result is correct!");
            } else {
                System.out.println("There is a mismatch. Please check the calculations.");
            }
        }

        scanner.close();
    }
}
