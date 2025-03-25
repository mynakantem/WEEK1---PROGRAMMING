import java.util.Scanner;

public class TwoDArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements of the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] oneDArray = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = arr[i][j];
            }
        }

        System.out.println("1D Array (Copied from 2D Array):");
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
