import java.util.Scanner;

public class QuadraticEquation {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};  
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};  
        } else {
            return new double[]{};  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Roots are real and distinct: x1 = " + roots[0] + ", x2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root is real and equal: x = " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        scanner.close();
    }
}
