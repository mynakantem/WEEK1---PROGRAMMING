import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers between 0-9
            }
        }
        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static double determinantMatrix(double[][] A) {
        int n = A.length;
        if (n == 2) { 
            return A[0][0] * A[1][1] - A[0][1] * A[1][0];
        } else if (n == 3) { 
            return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                 - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                 + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
        }
        return Double.NaN; 
    }

    public static double[][] inverseMatrix(double[][] A) {
        if (A.length != 2 || A[0].length != 2) {
            System.out.println("Inverse calculation is only supported for 2x2 matrices.");
            return null;
        }

        double det = determinantMatrix(A);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        double[][] inverse = {
            { A[1][1] / det, -A[0][1] / det },
            { -A[1][0] / det, A[0][0] / det }
        };

        return inverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        double[][] matrix1 = generateMatrix(rows, cols);
        double[][] matrix2 = generateMatrix(rows, cols);

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nMatrix Addition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        if (matrix1[0].length == matrix2.length) { 
            System.out.println("\nMatrix Multiplication:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("\nMatrix multiplication not possible due to dimension mismatch.");
        }

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        if (rows == cols) {
            double determinant = determinantMatrix(matrix1);
            System.out.println("\nDeterminant of Matrix 1: " + determinant);

            if (rows == 2) { 
                double[][] inverse = inverseMatrix(matrix1);
                if (inverse != null) {
                    System.out.println("\nInverse of Matrix 1:");
                    displayMatrix(inverse);
                }
            }
        } else {
            System.out.println("\nDeterminant and Inverse not possible for non-square matrices.");
        }

        sc.close();
    }
}
