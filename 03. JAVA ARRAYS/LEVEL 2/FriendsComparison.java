import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Finding the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Finding the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + " years)");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        scanner.close();
    }
}
