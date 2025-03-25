import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope, yIntercept;

        if (x1 == x2) {
            throw new ArithmeticException("Slope is undefined (Vertical Line)");
        }

        slope = (y2 - y1) / (x2 - x1);

        yIntercept = y1 - (slope * x1);

        return new double[]{slope, yIntercept}; // Return as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        try {
            double[] equation = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the Line: y = " + equation[0] + "x + " + equation[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
